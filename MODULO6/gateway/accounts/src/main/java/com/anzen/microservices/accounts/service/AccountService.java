package com.anzen.microservices.accounts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anzen.microservices.accounts.model.Accounts;

@Service
public interface AccountService {
	public List<Accounts> GetAccounts(int id);
}
