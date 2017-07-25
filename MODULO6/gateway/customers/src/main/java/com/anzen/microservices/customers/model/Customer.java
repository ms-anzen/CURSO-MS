package com.anzen.microservices.customers.model;

public class Customer {
	private int id;
	private String name;
	
	private Accounts accounts;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Customer(int id, String name, Accounts accounts) {
		this.id = id;
		this.name = name;
		this.accounts = accounts;
	}
	
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

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}			
}
