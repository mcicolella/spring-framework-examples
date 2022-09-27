package net.emmecilab.bean.lazy.loading.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import net.emmecilab.bean.lazy.loading.bean.AlwaysUsedBean;
import net.emmecilab.bean.lazy.loading.bean.NotAlwaysUsedBean;

@Configuration
public class Config {
	@Bean
	public AlwaysUsedBean alwaysUsedBean() {
		return new AlwaysUsedBean();
	}

	@Bean
	//@Lazy
	public NotAlwaysUsedBean notAlwaysUsedBean() {
		return new NotAlwaysUsedBean();
	}

}
