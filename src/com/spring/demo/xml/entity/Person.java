package com.spring.demo.xml.entity;

import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class Person {

	private String userName;
	
	private String password;
	
	private String email;
	
	private int age;
	
	private Car car;
	
	private Address address;
	
	private String sex;

	private List<Card> cards;
	
	private HashMap<String, Card> cardMap;
	
	private HashMap<Card, String> keyIsObject;
	
	private boolean hasCar;
	
	//必须含有无参构造器
	public Person() {
		super();
	}

	public Person(String userName, String password, int age, Car car) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.car = car;
	}
	
	public Person(String userName, String password, int age, String sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	
	public Person(String userName, String password, int age) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
	}
	
	public Person(String userName, String password, String sex) {
		super();
		this.userName = userName;
		this.password = password;
		this.sex = sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("userName:\t\t" + userName);
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public HashMap<String, Card> getCardMap() {
		return cardMap;
	}

	public void setCardMap(HashMap<String, Card> cardMap) {
		this.cardMap = cardMap;
	}

	public HashMap<Card, String> getKeyIsObject() {
		return keyIsObject;
	}

	public void setKeyIsObject(HashMap<Card, String> keyIsObject) {
		this.keyIsObject = keyIsObject;
	}

	public boolean isHasCar() {
		return hasCar;
	}

	public void setHasCar(boolean hasCar) {
		this.hasCar = hasCar;
	}

	@Override
	public String toString() {
		return "Person [userName=" + userName + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", car=" + car + ", address=" + address + ", sex=" + sex + ", cards=" + cards + ", cardMap=" + cardMap
				+ ", keyIsObject=" + keyIsObject + ", hasCar=" + hasCar + "]";
	}
	
}
