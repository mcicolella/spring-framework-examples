package net.emmecilab.beans.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BeansScopeApplication.class, args);

		SingletonBean s1 = ctx.getBean(SingletonBean.class);
		s1.print();
		
		SingletonBean s2 = ctx.getBean(SingletonBean.class);
		s2.print();
		
		PrototypeBean p1 = ctx.getBean(PrototypeBean.class);
		p1.print();

		PrototypeBean p2 = ctx.getBean(PrototypeBean.class);
		p2.print();
	}

}
