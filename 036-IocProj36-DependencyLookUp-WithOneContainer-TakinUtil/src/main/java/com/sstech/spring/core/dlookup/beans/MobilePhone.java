/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dlookup.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.dlookup.utils.IOCContainerUtil;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class MobilePhone {
	
	private String beanId;
	

	/**
	 * @param beanId the beanId to set
	 */
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
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
//		DefaultListableBeanFactory factory = null;
//		XmlBeanDefinitionReader reader = null;
		BeanFactory factory = null;
		MobilePhoneBateryCharger charger= null;
//		Create an Extra IOC Container
		factory = IOCContainerUtil.getContainer();
		/*		factory = new DefaultListableBeanFactory();
				reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/sstech/spring/core/dlookup/cfgs/applicationContext.xml");*/
//		System.out.println("2nd IOC Container");
//		Get Dependent BeanClass Object
		charger = factory.getBean(beanId,MobilePhoneBateryCharger.class);
//		Invoke the Methods
		charger.charge();
	}
}
