package com.anzen.repository;

import java.util.List;

import com.anzen.models.Account;
import com.anzen.models.User;

public interface AccountRepository {
	public List<Account> findAccountByUser(User user);

}
