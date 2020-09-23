/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.ni.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.ni.beans.PersonalInfo;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description : 
 */
public class NullInjectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		PersonalInfo info=null;
//		Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/ni/cfgs/applicationContext.xml");
		
//		Get Target Bean Class Object
		info = factory.getBean("perInfo",PersonalInfo.class);
		System.out.println(info);
		
		
	}

}
