/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.bs.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.bs.beans.Printer;
import com.sstech.spring.core.bs.beans.WishMessageGenerator;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
public class BeanScopeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory beanFactory=null;
		XmlBeanDefinitionReader reader = null;
		WishMessageGenerator generator1,generator2;
		Printer printer1,printer2;
		//Create IOC Container
		beanFactory=new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("com/sstech/spring/core/bs/cfgs/applicationContext.xml");
		//Get Target Class Object
		generator1=beanFactory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator1);
		generator2=beanFactory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator2);
		System.out.println("***************************************");
		System.out.println(generator1.hashCode()+"==========>"+generator2.hashCode());
		System.out.println("generator1==generator2 ?"+(generator1==generator2));
		System.out.println("****************************************");
		
		printer1=beanFactory.getBean("printer",Printer.class);
		System.out.println(printer1);
		printer2=beanFactory.getBean("printer",Printer.class);
		System.out.println(printer2);
		System.out.println("***************************************");
		System.out.println(printer1.hashCode()+"==========>"+printer2.hashCode());
		System.out.println("printer1==printer2 ?"+(printer1==printer2));
		System.out.println("****************************************");
		
	}

}
