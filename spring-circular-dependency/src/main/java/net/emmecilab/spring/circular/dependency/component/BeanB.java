package net.emmecilab.spring.circular.dependency.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

	private BeanA beanA;

	@Autowired
	public BeanB(BeanA beanA) {
		this.beanA = beanA;
	}
	
	
}
