package net.emmecilab.beanloading.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import net.emmecilab.beanloading.bean.BeanC;
import net.emmecilab.beanloading.bean.BeanD;

@Configuration
public class Config {

	@Bean
	public BeanC beanC() {
		return new BeanC();
	}

	@Bean
	@DependsOn("beanC")
	public BeanD beanD() {
		return new BeanD();
	}
}
