package com.mike.task.jspBoot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.task.jspBoot.web.domain.Account;
import com.mike.task.jspBoot.web.repository.AccountRepository;

@Service
public class AccountServiceImp implements AccountService {
	@Autowired
	private AccountRepository accountRepository; 
	
	@Override
	public List<Account> getAccounts(int id) {		
		return accountRepository.findById(id);
	}

}
