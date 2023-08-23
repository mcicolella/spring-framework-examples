package net.emmecilab.beanloading.bean;

import javax.annotation.PostConstruct;

public class BeanD {

	@PostConstruct
	private void initialize() {
		System.out.println("Initializing: " + this.getClass().getSimpleName());

	}
}
