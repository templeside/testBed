package com.Collection;

public class Customer {
	private Integer id;
	private String name;
	private String MoNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer id, String name, String moNumber) {
		super();
		this.id = id;
		this.name = name;
		MoNumber = moNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoNumber() {
		return MoNumber;
	}
	public void setMoNumber(String moNumber) {
		MoNumber = moNumber;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", MoNumber=" + MoNumber + "]";
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalized Called");
	}
}
