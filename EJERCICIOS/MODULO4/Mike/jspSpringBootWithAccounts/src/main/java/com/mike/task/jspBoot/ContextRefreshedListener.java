package com.mike.task.jspBoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.mike.task.jspBoot.web.domain.Account;
import com.mike.task.jspBoot.web.domain.Type;
import com.mike.task.jspBoot.web.domain.User;
import com.mike.task.jspBoot.web.service.Generator;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	private UserBean userBean;
	private AccountBean accountBean;
	
	@Autowired
	private Generator generator;
	
    @Autowired
    public void setEventHolderBean(UserBean userBean) {
        this.userBean = userBean;
    }
    
    @Autowired
    public void setEventHolderBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {               
        List<User> users = new ArrayList<User>();
    
    	users.add(new User(1, "mike", "chilenas"));
    	users.add(new User(2, "oscar", "password"));
    	users.add(new User(3, "paty", "password"));
    	
    	userBean.setUsers(users); 
    	createAccounts();
    }
    
    private void createAccounts() {
    	Map<Integer, List<Account>> globalAccounts = new HashMap<Integer, List<Account>>();
      
    	
        for (int i = 0; i < 3; i++){
        	List<Account> accounts = new ArrayList<Account>();
        	
        	accounts.add(new Account(generator.accountGenerator(), "alias" + (i + 1), Type.CREDIT));
        	accounts.add(new Account(generator.accountGenerator(), "alias" + (i + 2), Type.DEBIT));
        	accounts.add(new Account(generator.accountGenerator(), "alias" + (i + 3), Type.MASTER_CARD));
        
        	globalAccounts.put(i + 1, accounts);
        }
        
        accountBean.setAccounts(globalAccounts);
    }
}
