package com.anzen.microservices.accounts.model;

public class Account {
	private int id;
	private int customer;
	private String number;
	
	public Account(int id, int customer, String number){
		this.id = id;
		this.customer = customer;
		this.number = number;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustomer() {
		return customer;
	}
	
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
