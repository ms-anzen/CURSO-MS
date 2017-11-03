package com.mike.task.jspBoot.web.domain;

public class Account {
	private String number;
	private String alias;
	private Type type;
	
	public Account() {
		
	}
	
	public Account(String number, String alias, Type type) {
		this.number = number;
		this.alias = alias;
		this.type = type;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}	
	
	/*@Override
	public String toString() {
		return this.number + " Alias: " + this.alias + " Tipo: " + this.type + "\n";
	}*/
}
