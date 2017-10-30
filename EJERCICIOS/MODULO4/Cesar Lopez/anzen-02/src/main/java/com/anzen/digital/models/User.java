package com.anzen.digital.models;

public class User {
	
	public int id=0;
	public String name="";
	public String apPat="";
	public String apMat="";

	
	public User(int id, String name){
		this.id=id;
		this.name = name;
	}
	
	public User(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getApPat() {
		return apPat;
	}

	public void setApPat(String apPat) {
		this.apPat = apPat;
	}

	public String getApMat() {
		return apMat;
	}

	public void setApMat(String apMat) {
		this.apMat = apMat;
	}
	
	
	
	
	

}
