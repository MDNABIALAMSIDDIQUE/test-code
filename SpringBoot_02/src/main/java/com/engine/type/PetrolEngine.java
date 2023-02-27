package com.engine.type;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("This is Petrol Engine Start ....");

	}

	@Override
	public void stop() {
		System.out.println("This is Engine Stop .........");

	}

}
