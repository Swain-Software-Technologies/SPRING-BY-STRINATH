/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dlookup.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class MobilePhone {

	/**
	 * 
	 */
	public MobilePhone() {
		System.out.println("MobilePhone.MobilePhone()");
	}
	public void gaming() {
		System.out.println("MobilePhone.gaming(PUBG,FREEFIRE and LUDO)");
	}
	public void shoping() {
		System.out.println("MobilePhone.shoping(AMAZON,FLIPKART and ETC.)");
	}
	public void entertainment() {
		System.out.println("MobilePhone.entertainment(Prime Video,Netflix)");
	}
	public void batteryCharging() {
		System.out.println("MobilePhone.batteryCharging()");
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		MobilePhoneBateryCharger charger= null;
		String ch;
//		Create an Extra IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/dlookup/cfgs/applicationContext.xml");
		System.out.println("2nd IOC Container");
//		Get Dependent BeanClass Object
		charger = factory.getBean("charger",MobilePhoneBateryCharger.class);
//		Invoke the Methods
		charger.charge();
	}
}
