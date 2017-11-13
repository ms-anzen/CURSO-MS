package com.anzen.models;

/** POJO para guardar la info de los usuarios**/

public class User {
	
	private String id="";
	private String user="";
	private String pass="";
	private String lastAccess="";
	
	
	
	public User(String id, String user, String pass) {
		super();
		this.id = id;
		this.user = user;
		this.pass = pass;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getLastAccess() {
		return lastAccess;
	}


	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	

}
