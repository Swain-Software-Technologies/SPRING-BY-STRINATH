/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dlookup.utils;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class IOCContainerUtil {

	private static BeanFactory factory;
	static {
//		Create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/dlookup/cfgs/applicationContext.xml"));
	}
	public  static  BeanFactory  getContainer() {
		if(factory!=null)
		  return factory;
		else
			return null;
	}
}
