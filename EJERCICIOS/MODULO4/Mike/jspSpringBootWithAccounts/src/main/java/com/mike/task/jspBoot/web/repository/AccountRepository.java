package com.mike.task.jspBoot.web.repository;

import java.util.List;

import com.mike.task.jspBoot.web.domain.Account;

public interface AccountRepository {
	public List<Account> findById(int id);
}
