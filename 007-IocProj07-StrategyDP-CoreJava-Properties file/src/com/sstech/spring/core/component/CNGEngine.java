package com.sstech.spring.core.component;

public final class CNGEngine implements Engine {
	
	public CNGEngine() {
		System.out.println("CNGEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine:: engine started");
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine:: engine stopped");

	}

}
