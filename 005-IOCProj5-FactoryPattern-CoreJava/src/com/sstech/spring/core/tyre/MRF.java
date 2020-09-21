package com.sstech.spring.core.tyre;

public class MRF implements CarTyre {
	
	public MRF() {
		System.out.println("MRF:0-param consturctor");
	}

	@Override
	public String dimensions() {
		return "width:22 ;height: 20; grip: 10(MRF)";
	}

}
