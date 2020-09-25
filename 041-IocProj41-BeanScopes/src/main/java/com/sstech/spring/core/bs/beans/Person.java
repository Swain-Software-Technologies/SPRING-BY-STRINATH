package com.sstech.spring.core.bs.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Person {
	
	public Person() {
		System.out.println("Person:: 0-param consturctor");
	}
	
	public void  eating() {
		System.out.println("Person: eathing");
	}
	
	public  void dancing() {
		System.out.println("Person: dancing");
	}
}//class
