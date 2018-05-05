package com.spring.demo.xml.entity.property;

import java.util.Properties;

public class DataSource {
	
	private Properties properties;
	
	private Properties secondProperties;
	
	public DataSource() {
		super();
	}
	
	public DataSource(Properties secondProperties) {
		super();
		this.secondProperties = secondProperties;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Properties getSecondProperties() {
		return secondProperties;
	}

	public void setSecondProperties(Properties secondProperties) {
		this.secondProperties = secondProperties;
	}

	@Override
	public String toString() {
		return "DataSource [properties=" + properties + ", secondProperties=" + secondProperties + "]";
	}
	
}
