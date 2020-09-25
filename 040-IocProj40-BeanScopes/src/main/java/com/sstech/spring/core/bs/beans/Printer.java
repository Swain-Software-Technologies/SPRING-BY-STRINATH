/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.bs.beans;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
public class Printer {

	private static Printer INSTANCE;
	
	public Printer() {
		System.out.println("Printer.Printer()");
	}
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}
}
