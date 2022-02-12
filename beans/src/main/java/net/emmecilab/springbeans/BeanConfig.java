package net.emmecilab.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean(name = "student1")
	public Student getStudent1() {
		return new Student("pinco", "pallino");
	}
}
