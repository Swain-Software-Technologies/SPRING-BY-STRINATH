package com.sstech.spring.core.tyre;

public class CEAT implements CarTyre {
	
	public CEAT() {
		System.out.println("CEAT:0-param constructor");
	}

	@Override
	public String dimensions() {
		return "width:21 ;height: 21; grip: 11(CEAT)";
	}

}
