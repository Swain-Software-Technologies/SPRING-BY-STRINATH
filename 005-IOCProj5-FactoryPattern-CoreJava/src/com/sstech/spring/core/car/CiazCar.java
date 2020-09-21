package com.sstech.spring.core.car;

import com.sstech.spring.core.tyre.CarTyre;

public class CiazCar implements SuzukiCar {
	
	private CarTyre tyre;
	public CiazCar(CarTyre tyre) {
		System.out.println("CiazCar:1-param consturctor");
		this.tyre=tyre;
	}

	@Override
	public String specifications() {
		return "EngineCC:: 1700cc -> fuelType: Diesel ->model:sedan";
	}

	@Override
	public String drive() {
		return "driving   5+1 gear system ciaz car with tyres->"+tyre.dimensions();
	}

}
