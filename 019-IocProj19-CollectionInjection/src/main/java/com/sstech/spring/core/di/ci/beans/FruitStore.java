package com.sstech.spring.core.di.ci.beans;

import java.util.Date;
import java.util.Map;

public class FruitStore {
	private Map<String,String> fruits;
	private Map<String,Date>  specialDates;
	private Map<Date,String>  specialDates1;
	
	public void setSpecialDates1(Map<Date, String> specialDates1) {
		this.specialDates1 = specialDates1;
	}
	public void setFruits(Map<String, String> fruits) {
		System.out.println(fruits.getClass());
		this.fruits = fruits;
	}
	public void setSpecialDates(Map<String, Date> specialDates) {
		this.specialDates = specialDates;
	}
	@Override
	public String toString() {
		return "FruitStore [fruits=" + fruits + ", specialDates=" + specialDates + ", specialDates1=" + specialDates1
				+ "]";
	}
	
	
	

}
