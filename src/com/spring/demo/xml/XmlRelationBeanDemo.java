package com.spring.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.xml.entity.Car;
import com.spring.demo.xml.entity.Person;

public class XmlRelationBeanDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:context/relationapplicationcontext.xml");
		Car car = (Car) applicationContext.getBean("car1");
		Car car2 = (Car) applicationContext.getBean("car2");
// 父bean Car3是模板，所以无法实例化
//		Car car3 = (Car) applicationContext.getBean("car3");
		Car car4 = (Car) applicationContext.getBean("car4");
		Car car6 = (Car) applicationContext.getBean("car6");
		Person person = (Person) applicationContext.getBean("person");
		Person person2 = (Person) applicationContext.getBean("person2");
		
		//继承
		System.out.println("Car1 ----  " + car.toString());
		System.out.println("Car2 ----  " + car2.toString());
//		System.out.println("Car3 ----  " + car3.toString());
		System.out.println("Car4 ----  " + car4.toString());
		System.out.println("Car6 ----  " + car6.toString());
		
		//依赖
		System.out.println("Person1 ----  " + person.toString() + "\t\t" + ((person.getCar()!=null)?person.getCar().getCarName():null) + "\t\t" + ((person.getAddress()!=null)?person.getAddress().getLocation():null));
		System.out.println("Person2 ----  " + person2.toString() + "\t\t" + ((person2.getCar()!=null)?person2.getCar().getCarName():null) + "\t\t" + ((person2.getAddress()!=null)?person2.getAddress().getLocation():null));
	}

}
