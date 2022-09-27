package net.emmecilab.bean.lazy.loading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.emmecilab.bean.lazy.loading.bean.NotAlwaysUsedBean;

@SpringBootApplication
public class BeanLazyLoadingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BeanLazyLoadingApplication.class, args);
		//ctx.getBean(NotAlwaysUsedBean.class);
	}

}
