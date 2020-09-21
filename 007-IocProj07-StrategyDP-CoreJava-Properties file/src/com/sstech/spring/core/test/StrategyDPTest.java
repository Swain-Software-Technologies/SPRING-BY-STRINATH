package com.sstech.spring.core.test;

import com.sstech.spring.core.component.Viechle;
import com.sstech.spring.core.factory.ViechleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Viechle viechle=null;
		try {
		//get Viechle class obj
		viechle=ViechleFactory.getInstance();
		//invoke the method
		viechle.journey("hyd", "goa");
		System.out.println("................");
		viechle.journey("hyd", "bhopal");
		}
		catch(Exception e) {
			System.out.println("Internal Propblem");
			e.printStackTrace();
		}
		

	}

}
