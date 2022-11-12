package net.emmecilab.annotations.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("diesel-engine")
public class DieselEngine implements Engine {

	@Override
	public String start() {
		return "Starting DieselEngine ...";
	}

}
