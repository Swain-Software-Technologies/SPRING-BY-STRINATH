package com.sstech.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sstech.spring.core.beans.Flipkart;

public class BeanCollabarationTest1 {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/sstech/spring/core/cfgs/applicationContext.xml");
		//get Target class object
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke method
		System.out.println(fpkt.shopping(new String[] {"shirt","trouser", "sweets","crackers"},
				                                                        new float[] {2000,3000,1000,5000}));
		
	}

}
