package com.spring.demo.xml.entity;

public class Car {

	private String carName;
	
	private double price;

	private int id;
	
	public Car() {
		super();
	}
	
	public Car(double price, String carName, int id) {
		super();
		this.carName = carName;
		this.price = price;
		this.id = id;
	}
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", price=" + price + ", id=" + id + "]";
	}

}
