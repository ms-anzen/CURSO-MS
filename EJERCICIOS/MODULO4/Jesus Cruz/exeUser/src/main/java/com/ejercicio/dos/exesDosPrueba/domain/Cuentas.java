package com.ejercicio.dos.exesDosPrueba.domain;

import java.util.ArrayList;
import java.util.List;

public class Cuentas extends User{ 
	private List<String> accounts=new ArrayList<String>();
	
	public Cuentas(int id, String name,List<String> accounts) {
		super(id,name);
		this.accounts=accounts;		
	}
	
	public List<String> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}
}
