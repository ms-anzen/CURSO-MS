package com.anzen.microservices.accounts;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anzen.microservices.accounts.model.Accounts;

@Component
public class AccountBean {
	private HashMap<Integer, List<Accounts>> cutomerAccounts = new HashMap<Integer, List<Accounts>>();

	public HashMap<Integer, List<Accounts>> getCutomerAccounts() {
		return cutomerAccounts;
	}

	public void setCutomerAccounts(HashMap<Integer, List<Accounts>> cutomerAccounts) {
		this.cutomerAccounts = cutomerAccounts;
	}
}
