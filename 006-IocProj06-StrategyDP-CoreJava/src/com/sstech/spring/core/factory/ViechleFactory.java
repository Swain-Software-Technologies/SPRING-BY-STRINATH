package com.sstech.spring.core.factory;

import com.sstech.spring.core.comp.DieselEngine;
import com.sstech.spring.core.comp.Engine;
import com.sstech.spring.core.comp.PetrolEngine;
import com.sstech.spring.core.comp.Viechle;
import com.sstech.spring.core.comp.WaterEngine;
//Factory class
public class ViechleFactory {
	
	public static  Viechle getInstance(String engineType) {
		  Engine engg=null;
		  Viechle viechle=null;
		//create Dependent class obj
		  if(engineType.equalsIgnoreCase("diesel"))
			engg=new DieselEngine();
		else if(engineType.equalsIgnoreCase("petrol"))
			engg=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("water"))
			engg=new WaterEngine();
		else
			throw new IllegalArgumentException("Invalid  engine Type");
		//create Target class object 
		viechle=new Viechle();
		viechle.setEngine(engg);
		return viechle;
	}

}
