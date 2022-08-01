package net.emmecilab.dependency_injection.component;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public void turnOn() {
		System.out.println("Engine started");
	}
	
	public void turnOff() {
		System.out.println("Engine stopped");
	}
}
