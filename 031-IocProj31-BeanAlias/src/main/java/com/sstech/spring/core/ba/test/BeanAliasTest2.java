package com.sstech.spring.core.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sstech.spring.core.ba.beans.WishMessageGenerator;

public class BeanAliasTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessageGenerator generator=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Xml reader
		reader=new XmlBeanDefinitionReader(factory);
		//Load xml file
		//reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		reader.loadBeanDefinitions("com/sstech/spring/core/ba/cfgs/applicationContext.xml",
								   "com/sstech/spring/core/ba/cfgs/applicationContext2.xml");
		//get Bean
		generator=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println("Wish Message::"+generator.generateMessage("raja"));
		
		  
	}//main
}//class
