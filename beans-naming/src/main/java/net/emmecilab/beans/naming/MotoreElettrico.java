package net.emmecilab.beans.naming;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("electricEngine")
public class MotoreElettrico implements Motore {

	@Override
	public void start() {
		System.out.println("Starting MotoreElettrico");
	}

	@Override
	public void stop() {
		System.out.println("Stopping MotoreElettrico");

	}

}
