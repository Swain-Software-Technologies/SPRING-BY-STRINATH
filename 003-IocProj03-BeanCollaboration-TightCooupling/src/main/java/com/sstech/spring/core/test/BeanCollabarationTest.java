package com.sstech.spring.core.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sstech.spring.core.beans.Flipkart;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/configuration/applicationContext.xml"));
		//get Target class object
		fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke method
		System.out.println(fpkt.shopping(new String[] {"shirt","trouser", "sweets","crackers"},
				                                                        new float[] {2000,3000,1000,5000}));
		
	}

}
