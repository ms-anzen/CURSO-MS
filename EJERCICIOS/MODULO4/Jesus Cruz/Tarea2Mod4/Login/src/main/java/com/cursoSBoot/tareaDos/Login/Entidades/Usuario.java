package com.cursoSBoot.tareaDos.Login.Entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String user;
	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	private String password;
	private int edad;

	
	public Usuario(String nombre, String apellido, int edad, String user, String password) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.user=user;
		this.password=password;
	}

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean valida(String user,String password) {
		if(this.user.equals(user)&&this.password.equals(password)){
			return true;
		}	
		else {return false;}
	}
	
	public String dateLogin() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		Date dateLogin = new Date();
		return df.format(dateLogin);	
	}


	public String timeLogin() {
		DateFormat df=new SimpleDateFormat("HH:mm:ss");
		Date timeLogin=new Date();
		return df.format(timeLogin);
	}
}
