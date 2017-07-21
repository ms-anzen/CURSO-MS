package com.anzen.microservices.accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.anzen.microservices.accounts.AccountBean;
import com.anzen.microservices.accounts.model.Accounts;

@Service
public class AccountServiceImp implements AccountService {
	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<Accounts> GetAccounts(int id){
        AccountBean bean = context.getBean(AccountBean.class);
        
		return bean.getCutomerAccounts().get(id);
	}
}
