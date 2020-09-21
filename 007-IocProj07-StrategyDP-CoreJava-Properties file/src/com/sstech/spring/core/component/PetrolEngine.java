package com.sstech.spring.core.component;

public final class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PertrolEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine:: engine started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine:: engine stopped");

	}

}
