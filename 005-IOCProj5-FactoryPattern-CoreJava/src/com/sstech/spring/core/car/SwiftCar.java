package com.sstech.spring.core.car;

import com.sstech.spring.core.tyre.CarTyre;

public class SwiftCar implements SuzukiCar {
	private CarTyre tyre;
	public SwiftCar(CarTyre tyre) {
		System.out.println("SwiftCar:1-param consturctor");
		this.tyre=tyre;
	}

	@Override
	public String specifications() {
		return "EngineCC:: 1200cc -> fuelType: Diesel ->model: HatchBack ";
	}

	@Override
	public String drive() {
		return "driving   5+1 gear system Swift car with tyres::"+tyre.dimensions();
	}

}
