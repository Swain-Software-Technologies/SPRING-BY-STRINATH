/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not discannerlose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sstech.spring.core.di.customer.controller.CustomerController;
import com.sstech.spring.core.di.customer.vo.CustomerVo;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Descannerription : 
 */
public class RealtimeDITest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory=null;
		CustomerController customerController=null;
		Scanner scanner=null;
	    String customerId=null,customerName=null,customerAddrs=null,pamt=null,rate=null,time=null;
	    CustomerVo customerVo=null;
	     String result=null;
//		Create IOC Container
		factory = new XmlBeanFactory(new ClassPathResource("com/sstech/spring/core/di/customer/cfgs/applicationContext.xml"));
//		Get Controller Class Object
		customerController = factory.getBean("controller",CustomerController.class);
//		Read the Inputs and create VO Class Object having those inputs
		
		 scanner=new Scanner(System.in);
    	 System.out.println("Enter  Customer number");
    	 customerId=scanner.next();
    	 System.out.println("Enter  Customer name");
    	 customerName=scanner.next();
    	 System.out.println("Enter  Customer addrs");
    	 customerAddrs=scanner.next();
    	 System.out.println("Enter  Customer Principle amount");
    	 pamt=scanner.next();
    	 System.out.println("Enter  Customer rate of intrest");
    	 rate=scanner.next();
    	 System.out.println("Enter  Customer time of loan");
    	 time=scanner.next();
    	 
    	 customerVo = new CustomerVo();
    	 
    	 customerVo.setCustomerId(customerId);
    	 customerVo.setCustomerName(customerName);
    	 customerVo.setCustomerAddrs(customerAddrs);
    	 customerVo.setPrincipalAmt(pamt);
    	 customerVo.setRate(rate);
    	 customerVo.setTime(time);
    	 
//    	 Invoke Method
    	 try {
			 result = customerController.processEnroll(customerVo);
			 System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    	
	}

}
