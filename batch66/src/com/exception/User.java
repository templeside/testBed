package com.exception;

public class User {
	private int id;
	private String name;
	private String address;
	
	public User() {
		super();
	}

	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}
}
