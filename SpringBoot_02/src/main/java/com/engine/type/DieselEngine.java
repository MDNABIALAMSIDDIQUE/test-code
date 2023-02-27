package com.engine.type;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("This is Diesel Engine... Start..");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("This Is Diesel Engine==== Stop....");
	}

}
