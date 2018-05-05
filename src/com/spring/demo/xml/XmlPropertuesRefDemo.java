package com.spring.demo.xml;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlPropertuesRefDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:context/propertyapplicationcontext.xml");
		
		DataSource dataSources = (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSources);
 
	}

}
