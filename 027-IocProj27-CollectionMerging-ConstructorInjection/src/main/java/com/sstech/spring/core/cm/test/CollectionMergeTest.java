/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.cm.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.cm.beans.EnggCourse;

/**
 * @author Trinath, Sep 23, 2020
 *
 * @Description : 
 */
public class CollectionMergeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader = null;
		EnggCourse course,course2 = null;
//		Create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sstech/spring/core/cm/cfgs/applicationContext.xml");
		
//		Get target Bean Class Object
		course = factory.getBean("cse1stYrEngg",EnggCourse.class);
		course2 = factory.getBean("ece1stYrEngg",EnggCourse.class);
		System.out.println(course);
		System.out.println(course2);
	}

}
