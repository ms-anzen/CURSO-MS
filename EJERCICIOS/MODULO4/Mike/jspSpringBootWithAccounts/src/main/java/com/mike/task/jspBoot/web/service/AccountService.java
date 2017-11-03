package com.mike.task.jspBoot.web.service;

import java.util.List;

import com.mike.task.jspBoot.web.domain.Account;

public interface AccountService {
	public List<Account> getAccounts(int id);
}
