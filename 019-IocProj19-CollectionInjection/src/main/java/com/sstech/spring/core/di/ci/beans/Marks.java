package com.sstech.spring.core.di.ci.beans;

import java.util.Arrays;
import java.util.Date;

public class Marks {
	private int[] marks;
	private Date[] dates;
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setDates(Date[] dates) {
		this.dates = dates;
	}
	
	@Override
	public String toString() {
		return "Marks [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}
	
	

}
