package net.emmecilab.annotations.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("electric-engine")
public class ElectricEngine implements Engine {

	@Override
	public String start() {
		return "Starting ElectricEngine ...";
	}

}
