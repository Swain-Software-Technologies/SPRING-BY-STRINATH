package com.sstech.spring.core.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.sstech.spring.core.component.DieselEngine;
import com.sstech.spring.core.component.Engine;
import com.sstech.spring.core.component.PetrolEngine;
import com.sstech.spring.core.component.Viechle;
import com.sstech.spring.core.component.WaterEngine;
//Factory class
public class ViechleFactory {
	private static Properties props;
	static {
		InputStream is=null;
		try {
			//Load Properties file into java.util.Properties object
			is=new FileInputStream("src/com/sstech/spring/core/commons/app.properties");
			props=new Properties();
			props.load(is);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//static
	
	public static  Viechle getInstance()throws Exception {
		  Engine engg=null;
		  Viechle viechle=null;
		//create Dependent class obj dynamically
		  engg=(Engine)Class.forName(props.getProperty("dependent.class")).newInstance();
		 //create Target class obj dynamically
		  viechle=(Viechle)Class.forName(props.getProperty("target.class")).newInstance();
		  //set Dependent class obj to Target  class object
		viechle.setEngine(engg);
		//return Target class obj
		return viechle;
	}

}
