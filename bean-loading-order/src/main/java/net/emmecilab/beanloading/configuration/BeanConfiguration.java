package net.emmecilab.beanloading.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.emmecilab.beanloading.bean.BeanA;
import net.emmecilab.beanloading.bean.BeanB;
import net.emmecilab.beanloading.bean.BeanD;

@Configuration
public class BeanConfiguration {

	@Bean
	public BeanA beanA(BeanD dependency) {
		return new BeanA(dependency);
	}

	@Bean
	public BeanB beanB() {
		return new BeanB();
	}

}
