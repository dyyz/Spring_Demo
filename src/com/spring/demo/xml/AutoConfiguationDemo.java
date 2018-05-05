package com.spring.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.xml.entity.Person;

public class AutoConfiguationDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context/autoapplicationcontext.xml");
		Person person = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person2");
		
		System.out.println("Person1 ----  " + person.toString() + "\t\t" + ((person.getCar()!=null)?person.getCar().getCarName():null) + "\t\t" + ((person.getAddress()!=null)?person.getAddress().getLocation():null));
		System.out.println("Person2 ----  " + person2.toString() + "\t\t" + ((person2.getCar()!=null)?person2.getCar().getCarName():null) + "\t\t" + ((person2.getAddress()!=null)?person2.getAddress().getLocation():null));
	}

}
