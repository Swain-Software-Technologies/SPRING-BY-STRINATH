/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dlookup.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.dlookup.beans.MobilePhone;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class DependencyLookUpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MobilePhone phone=null;
//		Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/dlookup/cfgs/applicationContext.xml");
		System.out.println("Main IOC COntainer");
//		Get Target Bean Class Object
		phone = factory.getBean("phone",MobilePhone.class);
//		Invoke method
		phone.gaming();phone.shoping();phone.entertainment();
		phone.batteryCharging();
		
	}

}
