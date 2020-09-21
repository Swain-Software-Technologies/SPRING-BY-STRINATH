/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sstech.spring.core.beans.WishMessageGenerator;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public class ConstructorInjectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 ApplicationContext ctx=null;
		 Object obj=null,obj1=null;
		 WishMessageGenerator generator=null;
		 
		//create IOC container
//		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 ctx=new ClassPathXmlApplicationContext("com/sstech/spring/core/configuration/applicationContext.xml");
//		 ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		 //get Target Bean class object
		 generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 //invoke b.method
		 System.out.println("result:::"+generator.generateMessage("Rahul")); 
		//close container
		 ((AbstractApplicationContext) ctx).close();
	}

}
