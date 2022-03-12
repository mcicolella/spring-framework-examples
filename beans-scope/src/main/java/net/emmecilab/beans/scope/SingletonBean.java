package net.emmecilab.beans.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	public void print() {
		System.out.println(this);
	}
}
