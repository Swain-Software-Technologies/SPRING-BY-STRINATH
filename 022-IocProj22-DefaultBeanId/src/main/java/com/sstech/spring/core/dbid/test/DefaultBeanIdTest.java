/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dbid.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sstech.spring.core.dbid.beans.WishMessageGenerator;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description : 
 */
public class DefaultBeanIdTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource res=null;
		 BeanFactory factory=null;
		 Object obj=null,obj1=null;
		 WishMessageGenerator generator=null,generator1=null;
		//Locate and hold Spring bean cfg file
		 res=new ClassPathResource("com/sstech/spring/core/dbid/cfgs/applicationContext.xml");
		 //create BeanFactory IOC container
		 factory=new XmlBeanFactory(res);
		 //get Target Bean class object
		 obj=factory.getBean("wmg");
		 //type casting
		 generator=(WishMessageGenerator)obj;
		 //invoke b.method
		 System.out.println("result:::"+generator.generateMessage("raja")); 
		 
		 System.out.println("..................................");
		 generator1=factory.getBean("wmg1",WishMessageGenerator.class);
		 System.out.println("result1:::"+generator1.generateMessage("rani"));

	}

}
