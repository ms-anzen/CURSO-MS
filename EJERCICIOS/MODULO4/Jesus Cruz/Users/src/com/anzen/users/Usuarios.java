package com.anzen.users;

public class Usuarios {

	public  int id;
	public int age;
	public String name;
	public String lastName;
	public String email;	
	
	public Usuarios() {
		id=0;
		age=0;
		name="";
		lastName="";
		email="";
	}
	
	public Usuarios(int id, int age, String name, String lastName,  String email)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		this.lastName=lastName;
		this.email=email;		
	}
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
