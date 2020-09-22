package com.sstech.spring.core.di.ci.beans;

import java.util.Date;
import java.util.List;

public class College {
	private List<String>studNames;
	private List<Date>  dates;
	
	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}
	public void setDates(List<Date> dates) {
		System.out.println(dates.getClass());
		this.dates = dates;
	}
	
	@Override
	public String toString() {
		return "College [studNames=" + studNames + ", dates=" + dates + "]";
	}
	
	
	

}
