package com.sstech.spring.core.component;

public final class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine:: engine started");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine:: engine stopped");

	}

}
