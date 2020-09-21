package com.sstech.sprig.core.factory;

import com.sstech.spring.core.car.BalenoCar;
import com.sstech.spring.core.car.CiazCar;
import com.sstech.spring.core.car.SuzukiCar;
import com.sstech.spring.core.car.SwiftCar;
import com.sstech.spring.core.tyre.CEAT;
import com.sstech.spring.core.tyre.CarTyre;
import com.sstech.spring.core.tyre.MRF;
import com.sstech.spring.core.tyre.Michelan;

public class SuzukiCarFactory {
	
	//factory method
	public  static  SuzukiCar  getInstance(String carType,String tyreType) {
		SuzukiCar  car=null;
		CarTyre tyre=null;
		if(tyreType.equalsIgnoreCase("MRF"))
			tyre=new MRF();
		else if(tyreType.equalsIgnoreCase("ceat"))
			tyre=new CEAT();
		else if(tyreType.equalsIgnoreCase("michelan"))
			tyre=new Michelan();
		else 
			throw new IllegalArgumentException("Invalid tyre type");
		
		if(carType.equalsIgnoreCase("swift"))
			car=new SwiftCar(tyre);
		else if(carType.equalsIgnoreCase("baleno"))
			   car=new BalenoCar(tyre);
		else if(carType.equalsIgnoreCase("ciaz"))
			   car=new CiazCar(tyre);
		else
			throw new IllegalArgumentException("invalid  car type");
		return car;
	}

}
