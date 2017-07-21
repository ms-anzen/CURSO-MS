package com.anzen.microservices.accounts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anzen.microservices.accounts.model.Accounts;

public class AccountServiceImp implements AccountService {
	@Override
	public List<Accounts> GetAccounts(int id){
		List<Accounts> accounts = new ArrayList<Accounts>();
		
		ConfigurableApplicationContext ctx = SpringApplication.run(ContextRefresehedApplication.class, args);
        EventHolderBean bean = ctx.getBean(AccountBean.class);
		
		return accounts;
	}
}
