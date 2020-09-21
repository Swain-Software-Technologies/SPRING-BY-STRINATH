package com.sstech.spring.core.component;

public final class WaterEngine implements Engine {
	
	public WaterEngine() {
		System.out.println("WaterEngine::0-param constructor");
	}

	
	public void start() {
		System.out.println("WaterEngine:: engine started");
	}

	
	public void stop() {
		System.out.println("WaterEngine:: engine stopped");

	}

}
