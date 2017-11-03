package com.anzen;

/** POJO para guardar la info de los usuarios**/

public class Users {
	private String user="";
	private String pass="";
	private String lastAccess="";
	
	
	
	public Users(String user, String pass) {
		super();
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
	
	

}
