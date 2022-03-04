package net.emmecilab.beans.naming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansNamingApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("electricEngine")
	private Motore motore;

	public static void main(String[] args) {
		SpringApplication.run(BeansNamingApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		motore.start();
	}

}
