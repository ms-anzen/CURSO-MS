package com.anzen.microservices.customers.model;

public class Accounts {
	private String number;
	
	public Accounts() {
		
	}
	
	public Accounts(String number){
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
