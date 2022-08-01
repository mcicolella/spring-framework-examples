package net.emmecilab.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.emmecilab.dependency_injection.component.Car;
import net.emmecilab.dependency_injection.component.Engine;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

	//@Autowired
	//Car c;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Engine e = new Engine();
		// Car c = new Car(e);
		//c.start();
	}

}
