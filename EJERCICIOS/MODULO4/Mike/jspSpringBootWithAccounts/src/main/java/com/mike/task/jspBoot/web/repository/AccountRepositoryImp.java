package com.mike.task.jspBoot.web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.mike.task.jspBoot.AccountBean;
import com.mike.task.jspBoot.web.domain.Account;

@Repository
public class AccountRepositoryImp implements AccountRepository {
	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<Account> findById(int id) {
		AccountBean accountBean = context.getBean(AccountBean.class);
		List<Account> findAccounts = null;
		
		for (int key : accountBean.getAccounts().keySet()) {
			if(key == id) {
				findAccounts = accountBean.getAccounts().get(id);
			}
		}
		
		return findAccounts;
	}
}
