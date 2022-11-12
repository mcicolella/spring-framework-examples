package net.emmecilab.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.emmecilab.annotations.service.Engine;

@RestController
public class EngineController {

	@Autowired
	@Qualifier("diesel-engine")
	private Engine engine;

	@GetMapping("/engine")
	public String getEngine() {
		return engine.start();
	}
}
