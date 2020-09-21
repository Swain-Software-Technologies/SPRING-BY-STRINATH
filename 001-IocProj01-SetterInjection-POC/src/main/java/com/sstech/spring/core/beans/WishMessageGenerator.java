/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.beans;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
import java.util.Date;

public class WishMessageGenerator {
	 //bean property
   private Date date;
   
   public WishMessageGenerator() {
	System.out.println("WishMessageGenerator::0-param constructor");
}
   
   //setter method supporting setter Injection
   public void setDate(Date date) {
	   System.out.println("WishMessageGenerator.setDate()");
	   this.date=date;
   }
   
  //write  b.method having b.logic  using  Injected Date class object
   
   public  String  generateMessage(String user) {
	   int hour=0;
	   System.out.println("Injected date ::"+date);
	   //get current hour of the day
	   hour=date.getHours(); // 24 hrs format
	   //generate wish message
	   if(hour<12)
		      return "Good Morning:::"+user;
	   else if(hour<16)
		   return "Good AfterNoon::"+user;
	   else if(hour<20)
		   return "Good Evening::"+user;
	   else
		   return "Good Night::"+user;
   }
   
}

