package com.sstech.spring.core.component;

public final class Viechle {
	private Engine engine;
	
	public Viechle() {
		System.out.println("Viechle:: 0-param constructor");
	}

	public void setEngine(Engine engine) {
		System.out.println("Viechle.setEngine(-)");
		this.engine = engine;
	}
	
	public  void   journey(String start, String end) {
		engine.start();
		System.out.println("Viechle started from  "+start+" place");
		System.out.println("Jounery is going on........");
		engine.stop();
		System.out.println("Viechle stopped at "+end+" place");
		System.out.println("Jounery completed");
	}

}
