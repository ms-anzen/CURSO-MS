package com.mike.task.jspBoot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mike.task.jspBoot.web.domain.Account;

@Component
public class AccountBean {
	private Map<Integer, List<Account>> accounts = new HashMap<Integer, List<Account>>();

	public Map<Integer, List<Account>> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, List<Account>> accounts) {
		this.accounts = accounts;
	}	
}
