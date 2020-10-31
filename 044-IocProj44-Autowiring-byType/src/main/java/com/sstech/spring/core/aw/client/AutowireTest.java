/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.aw.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.aw.beans.TravelAgent;

/**
 * @author Trinath, Sep 26, 2020
 *
 * @Description : 
 */
public class AutowireTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DefaultListableBeanFactory beanFactory = null;
		XmlBeanDefinitionReader reader = null;
		TravelAgent agent = null;
//		Create IOC container
		beanFactory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("com/sstech/spring/core/aw/cfgs/applicationContext.xml");
//		Get Target Class Object
		agent=beanFactory.getBean("travelAgent",TravelAgent.class);
		System.out.println(agent.tourBudgeting());

	}

}
