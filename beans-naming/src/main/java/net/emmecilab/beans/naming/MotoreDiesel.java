package net.emmecilab.beans.naming;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MotoreDiesel implements Motore {

	@Override
	public void start() {
		System.out.println("Starting MotoreDiesel");

	}

	@Override
	public void stop() {
		System.out.println("Stopping MotoreDiesel");

	}

}
