/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dl.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class Cricketer {
	private String beanId;

	/**
	 * @param beanId the beanId to set
	 */
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		Bat bat =null;
		int runs=0;
		BeanFactory factory =null;
//		Create IOC Container
		factory = new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/dl/cfgs/applicationContext.xml"));
		System.out.println("2nd IOC Contaner");
//		Perform Dependency Lookup
		bat = factory.getBean(beanId,Bat.class);
//		Invoke Method
		runs=bat.scoreRuns();
		System.out.println("Cricketer is batting with the Score "+runs);
	}
	
	public void bowling() {
		System.out.println("Cricketer is bolwing");
	}
	
	public   void fielding() {
		System.out.println("Cricketer is fielding");
	}

}
