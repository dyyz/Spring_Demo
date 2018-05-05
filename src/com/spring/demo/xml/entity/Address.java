package com.spring.demo.xml.entity;

public class Address {

	private String location;
	private int id;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", id=" + id + "]";
	}
	
}
