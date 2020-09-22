/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sstech.spring.core.di.ci.beans.College;
import com.sstech.spring.core.di.ci.beans.FacultiesInfo;
import com.sstech.spring.core.di.ci.beans.FruitStore;
import com.sstech.spring.core.di.ci.beans.Marks;
import com.sstech.spring.core.di.ci.beans.PersonalInfo;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description : 
 */
public class CollectionInjectionTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		BeanFactory factory = null;
		Marks marks = null;
		College college = null;
		PersonalInfo pInfo=null; 
		FruitStore fruitStore = null;
		FacultiesInfo faultyInfo = null;
//		Create IOC Container
		factory = new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/di/ci/cfgs/applicationContext.xml"));
//		Get the Target CLass Object
		System.out.println("*******************************************");
		marks = factory.getBean("mrk",Marks.class);
		System.out.println(marks);
		System.out.println("*******************************************");
		college = factory.getBean("clg",College.class);
		System.out.println(college);
		System.out.println("*******************************************");
		pInfo = factory.getBean("perInfo",PersonalInfo.class);
		System.out.println(pInfo);
		System.out.println("*********************************************");
		fruitStore=factory.getBean("fruitStore",FruitStore.class);
		System.out.println(fruitStore);
		System.out.println("*********************************************");
		faultyInfo=factory.getBean("fInfo",FacultiesInfo.class);
		System.out.println(faultyInfo);
		System.out.println("*********************************************");
	}

}
