package com.sstech.spring.core.beans;

public class Student {
	private int sno;
	private String sname;
	private float  avg;
	
	public Student(int sno, String name, float avg) {
	   System.out.println("Student:: 3-param constructor");
		this.sno = sno;
		this.sname = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}
	
	
	

}
