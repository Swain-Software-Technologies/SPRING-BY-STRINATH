package com.sstech.spring.core.beans;

public class B {

	private A a;
	
	public void setA(A a) {
		System.out.println("B.setA(-)");
		this.a = a;
	}


	public B() {
		System.out.println("B:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "B [a=" ;
	}
	
	
	

}
