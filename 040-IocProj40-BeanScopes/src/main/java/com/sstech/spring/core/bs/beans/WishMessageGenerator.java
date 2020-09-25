/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.bs.beans;

import java.util.Date;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
public class WishMessageGenerator {

	private Date date;

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateMessage(String user) {
		int hour=0;
		System.out.println("Injected Date :: " +date);
//		Get Current Hour Of the Day
		hour=date.getHours();
//		Generate Wish Message
		if(hour<12) {
			return "Good Morning "+user;
		}else if(hour<16) {
			return "Good Afternoon "+user;
		}else if (hour<20) {
			return "Good Evng"+user;
		}else {
			return "Good Night "+user;
		}
	}
}
