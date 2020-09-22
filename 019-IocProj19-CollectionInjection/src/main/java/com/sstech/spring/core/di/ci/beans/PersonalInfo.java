package com.sstech.spring.core.di.ci.beans;

import java.util.Date;
import java.util.Set;

public class PersonalInfo {
	private  Set<Long>  phonesNumbers;
	private  Set<Date>  dates;

	public void setPhonesNumbers(Set<Long> phonesNumbers) {
		System.out.println(phonesNumbers.getClass());
		this.phonesNumbers = phonesNumbers;
	}

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "PersonalInfo [phonesNumbers=" + phonesNumbers + ", dates=" + dates + "]";
	}
	
	

}
