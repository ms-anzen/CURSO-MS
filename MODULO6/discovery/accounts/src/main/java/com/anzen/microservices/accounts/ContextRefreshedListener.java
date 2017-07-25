package com.anzen.microservices.accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.anzen.microservices.accounts.model.Accounts;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	private AccountBean accountBean;

    @Autowired
    public void setEventHolderBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {               
        HashMap<Integer, List<Accounts>> globalAccounts = new HashMap<Integer, List<Accounts>>();
        
        for (int i = 0; i < 5; i++){
        	List<Accounts> accounts = new ArrayList<Accounts>();
        	
        	accounts.add(new Accounts("123456" + i));
        	accounts.add(new Accounts("999999" + i));
        	accounts.add(new Accounts("555555" + i));        
        	
        	globalAccounts.put(i + 1, accounts);
        }
        
        accountBean.setCutomerAccounts(globalAccounts);
    }
}
