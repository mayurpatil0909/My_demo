package com.test.serialization;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = -9042490859108805286L;

	int id;
	String name;
	String emailAddress;
	int contactNumber;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNumber() {
		return contactNumber ; 
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

}
