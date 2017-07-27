package com.anzen.microservices.accounts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.anzen.microservices.accounts.AccountBean;
import com.anzen.microservices.accounts.model.Accounts;

@Service
public class AccountsServiceImp implements AccountsService {
	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<Accounts> GetAccounts(){
        AccountBean bean = context.getBean(AccountBean.class);
        
        List<Accounts> accounts = new ArrayList<Accounts>();
        
        for (List<Accounts> cuentas : bean.getCutomerAccounts().values()) {
        	for (Accounts c : cuentas) {
        		accounts.add(c);
        	}
        }
        
		return accounts;
	}
	
	@Override
	public List<Accounts> GetCustomerAccounts(int id){
		AccountBean bean = context.getBean(AccountBean.class);
		
		return bean.getCutomerAccounts().get(id);
	}
}
