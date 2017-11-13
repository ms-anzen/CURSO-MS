package com.anzen.services;
import java.util.List;

import com.anzen.models.Account;
import com.anzen.models.User;

public interface AccountService {
	public List<Account> obtenerCuentasporUsuario(User user);
	
}
