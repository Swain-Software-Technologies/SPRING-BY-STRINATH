package com.sstech.spring.core.component;

public final class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PertrolEngine::0-param constructor");
	}


	public void start() {
		System.out.println("PetrolEngine:: engine started");
	}
	public void stop() {
		System.out.println("PetrolEngine:: engine stopped");

	}

}
