package com.anzen.models;

public class Account {
	private String numero="";
	private String alias="";
	private String tipo="";
	
	
	public Account(String numero, String alias, String tipo) {
		super();
		this.numero = numero;
		this.alias = alias;
		this.tipo = tipo;
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
