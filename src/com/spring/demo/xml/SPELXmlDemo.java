package com.spring.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.demo.xml.entity.Car;
import com.spring.demo.xml.entity.Person;
import com.spring.demo.xml.entity.property.DataSource;

public class SPELXmlDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:context/spelapplicationcontext.xml");
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println("Car1 ----  " + car.toString());
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println("Person1 ----  " + person.toString() + "\t\t" + ((person.getCar()!=null)?person.getCar().getCarName():null) + "\t\t" + ((person.getAddress()!=null)?person.getAddress().getLocation():null));
		
	}
}
