package net.emmecilab.spring.circular.dependency.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	
	//@Autowired
	private BeanB beanB;

	public BeanA() {
	}

	public BeanB getBeanB() {
		return beanB;
	}

	//@Autowired
	//public void setBeanB(BeanB beanB) {
	//	this.beanB = beanB;
	//}
	
	

	@Autowired
	public BeanA(@Lazy BeanB beanB) {
		this.beanB = beanB;
	}
	

}
