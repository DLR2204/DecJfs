package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
//		ApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");
		
		Resource resource = new ClassPathResource("Spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		System.out.println(factory.getBean("emp"));
		
	}

}
