/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.ib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.ib.beans.BankCustomer;

/**
 * @author Trinath, Sep 23, 2020
 *
 * @Description : 
 */
public class InnerBeanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		BankCustomer customer = null;
//		Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/ib/cfgs/applicationContext.xml");
//		Get Target Bean Class Object
		customer = factory.getBean("bankCustomer",BankCustomer.class);
		System.out.println(customer);
	}

}
