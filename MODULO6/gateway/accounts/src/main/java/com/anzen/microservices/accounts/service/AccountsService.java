package com.anzen.microservices.accounts.service;

import java.util.List;

import com.anzen.microservices.accounts.model.Accounts;


public interface AccountsService {
	public List<Accounts> GetAccounts();
	public List<Accounts> GetCustomerAccounts(int id);
}
