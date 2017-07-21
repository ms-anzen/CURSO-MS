package com.anzen.microservices.accounts.service;

import java.util.List;

import com.anzen.microservices.accounts.model.Accounts;


public interface AccountService {
	public List<Accounts> GetAccounts(int id);
}
