package com.cursospring.T2M4.entidades;

import org.springframework.stereotype.Repository;

@Repository
public class Usuario {
	String usuario = "miusuario";
	String password = "password";
	String ultimoAcceso;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(String ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}	
}
