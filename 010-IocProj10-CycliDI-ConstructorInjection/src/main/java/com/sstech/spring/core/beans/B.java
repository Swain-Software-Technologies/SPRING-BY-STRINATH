package com.sstech.spring.core.beans;

public class B {

	private A a;
	
	
	public B(A a) {
		System.out.println("B:: 1-param constructor");
		this.a=a;
	}
	
	

	@Override
	public String toString() {
		return "B [a=" ;
	}
	
	
	

}
