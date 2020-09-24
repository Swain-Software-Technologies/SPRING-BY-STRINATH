/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.fmbi.test;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class FactoryMethodBeanInstantiationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Class clazz = null;
		Calendar calender = null;
		Properties props = null;
		String str1,str2;
//		Create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/fmbi/cfgs/applicationContext.xml");
//		Get target Class Object
		clazz = factory.getBean("clazz", Class.class);
		System.out.println("Class Name is "+clazz.getClass()+" having data of:::"+clazz);
		System.out.println("***********************************************");
		calender = factory.getBean("cal",Calendar.class);
		System.out.println("Class Name is "+calender.getClass()+" having instance of "+calender);
		System.out.println("***********************************************");
		props = factory.getBean("sysProp",Properties.class);
		System.out.println("Class Name is "+props.getClass()+" having Propertes of "+props);
		System.out.println("************************************************************");
		 str1=factory.getBean("s2",String.class);
	     System.out.println(str1);
	     System.out.println("**************************************");
	     str2=factory.getBean("s3",String.class);
	     System.out.println("class name::"+str2.getClass()+"  data::"+str2);
	}

}
