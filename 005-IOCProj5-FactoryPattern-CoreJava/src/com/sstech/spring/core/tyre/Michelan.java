package com.sstech.spring.core.tyre;

public class Michelan implements CarTyre {
	
	public Michelan() {
		System.out.println("Michelan:: 0-param constructor");
	}

	@Override
	public String dimensions() {
		return "width:22 ;height: 20; grip: 10 (Michelan)";
	}

}
