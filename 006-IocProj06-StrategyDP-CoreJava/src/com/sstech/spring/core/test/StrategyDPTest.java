package com.sstech.spring.core.test;

import com.sstech.spring.core.comp.Viechle;
import com.sstech.spring.core.factory.ViechleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Viechle viechle=null;
		//get Viechle class obj
		viechle=ViechleFactory.getInstance("diesel");
		//invoke the method
		viechle.journey("hyd", "goa");
		

	}

}
