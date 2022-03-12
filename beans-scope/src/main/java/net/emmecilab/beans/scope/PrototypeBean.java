package net.emmecilab.beans.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
	public void print() {
		System.out.println(this);
	}
}
