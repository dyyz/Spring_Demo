package com.spring.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.xml.entity.Car;

public class XmlScopeBeanDemo {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context/scopeapplicationcontext.xml");
		Car singleCar1 = (Car) applicationContext.getBean("singleCar");
		Car singleCar2 = (Car) applicationContext.getBean("singleCar");
		System.out.println("Single Scope:  " + (singleCar1 == singleCar2));
		
		Car prototypeCar1 = (Car) applicationContext.getBean("prototypeCar");
		Car prototypeCar2 = (Car) applicationContext.getBean("prototypeCar");
		System.out.println("Prototype Scope:  " + (prototypeCar1 == prototypeCar2));
	}

}
