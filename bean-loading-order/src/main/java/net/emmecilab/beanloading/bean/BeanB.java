package net.emmecilab.beanloading.bean;

import javax.annotation.PostConstruct;

public class BeanB {

	@PostConstruct
	private void initialize() {
		System.out.println("Initializing: " + this.getClass().getSimpleName());

	}
}