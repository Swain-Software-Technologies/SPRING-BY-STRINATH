/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sstech.spring.core.bi.beans.Bike;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description : 
 */
public class BeanInheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BeanFactory factory=null;
		Bike bike1=null,bike2=null;
	   //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/bi/cfgs/applicationContext.xml"));
		//get Bike class obj
		bike1=factory.getBean("rajaPulsor",Bike.class);
		System.out.println(bike1);
		
		System.out.println(".......................");
		bike2=factory.getBean("raviPulsor",Bike.class);
		System.out.println(bike2);
		
		System.out.println(".......................");
		bike2=factory.getBean("basePulsor",Bike.class);
		System.out.println(bike2);
	}

}
