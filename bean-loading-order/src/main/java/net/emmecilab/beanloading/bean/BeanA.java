package net.emmecilab.beanloading.bean;

import javax.annotation.PostConstruct;

public class BeanA {

	public BeanA(BeanD dependency) {
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("Initializing: " + this.getClass().getSimpleName());

	}
}
