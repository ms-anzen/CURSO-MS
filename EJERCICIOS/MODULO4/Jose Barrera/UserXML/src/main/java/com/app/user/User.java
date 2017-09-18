package com.app.user;

public class User {
	private String name;
	private String lastname;
	private String email;
	private int age;
	
	public User(String name, String lastname, int age, String email) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
