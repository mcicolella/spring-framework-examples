package net.emmecilab.beans.naming;

import org.springframework.stereotype.Component;

@Component
public interface Motore {
	public void start();

	public void stop();
}
