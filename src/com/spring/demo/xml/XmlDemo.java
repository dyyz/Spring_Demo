package com.spring.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.demo.xml.entity.Person;
import com.spring.demo.xml.entity.property.DataSource;

public class XmlDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:context/applicationcontext.xml");
		Person person = (Person) applicationContext.getBean("person");
		Person person2 = (Person) applicationContext.getBean("person2");
		Person person3 = (Person) applicationContext.getBean("person3");
		Person person4 = (Person) applicationContext.getBean("person4");
		Person person5 = (Person) applicationContext.getBean("person5");
		Person person6 = (Person) applicationContext.getBean("person6");
		Person person7 = (Person) applicationContext.getBean("person7");
		Person person8 = (Person) applicationContext.getBean("person8");
		Person person9 = (Person) applicationContext.getBean("person9");
		
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		// 1. 属性注入优先于构造器注入
		// 2. 特殊字符必须放在[!CDATA[param]]的param中
		// 3. 元素为null，不需要放在<value>标签中
		// 4. constructor-arg中index从0开始
		System.out.println("Person1 ----  " + person.toString() + "\t\t" + ((person.getCar()!=null)?person.getCar().getCarName():null) + "\t\t" + ((person.getAddress()!=null)?person.getAddress().getLocation():null));
		System.out.println("Person2 ----  " + person2.toString() + "\t\t" + ((person2.getCar()!=null)?person2.getCar().getCarName():null) + "\t\t" + ((person2.getAddress()!=null)?person2.getAddress().getLocation():null));
		System.out.println("Person3 ----  " + person3.toString() + "\t\t" + ((person3.getCar()!=null)?person3.getCar().getCarName():null) + "\t\t" + ((person3.getAddress()!=null)?person3.getAddress().getLocation():null));
		System.out.println("Person4 ----  " + person4.toString() + "\t\t" + ((person4.getCar()!=null)?person4.getCar().getCarName():null) + "\t\t" + ((person4.getAddress()!=null)?person4.getAddress().getLocation():null));
		System.out.println("Person5 ----  " + person5.toString() + "\t\t" + ((person5.getCar()!=null)?person5.getCar().getCarName():null) + "\t\t" + ((person5.getAddress()!=null)?person5.getAddress().getLocation():null));
		System.out.println("Person6 ----  " + person6.toString() + "\t\t" + ((person6.getCar()!=null)?person6.getCar().getCarName():null) + "\t\t" + ((person6.getAddress()!=null)?person6.getAddress().getLocation():null));
		System.out.println("Person7 ----  " + person7.toString() + "\t\t" + ((person7.getCar()!=null)?person7.getCar().getCarName():null) + "\t\t" + ((person7.getAddress()!=null)?person7.getAddress().getLocation():null));
		System.out.println("Person8 ----  " + person8.toString() + "\t\t" + ((person8.getCar()!=null)?person8.getCar().getCarName():null) + "\t\t" + ((person8.getAddress()!=null)?person8.getAddress().getLocation():null));
		System.out.println("Person9 ----  " + person9.toString() + "\t\t" + ((person9.getCar()!=null)?person9.getCar().getCarName():null) + "\t\t" + ((person9.getAddress()!=null)?person9.getAddress().getLocation():null));
		System.out.println("DataSource ----  " + dataSource);
	}
}
