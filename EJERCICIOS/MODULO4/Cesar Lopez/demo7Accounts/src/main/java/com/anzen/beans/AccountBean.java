package com.anzen.beans;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.anzen.models.Account;

@Component
public class AccountBean {
	
	/** Metodos para cuentas: setear y obtener cuentas**/
	private Map<String, List<Account>> accounts = new HashMap<String, List<Account>>();

	public Map<String, List<Account>> getAccounts() {
		return accounts;
	}
	public void setAccounts(Map<String, List<Account>> accounts) {
		this.accounts = accounts;
	}	

}
