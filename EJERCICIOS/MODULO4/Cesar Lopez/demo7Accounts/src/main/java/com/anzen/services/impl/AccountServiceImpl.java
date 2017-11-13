package com.anzen.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.anzen.beans.AccountBean;
import com.anzen.models.Account;
import com.anzen.models.User;
import com.anzen.repository.AccountRepository;
import com.anzen.services.AccountService;

/** Lista de servicios en relación a cuentas **/
@Service
public class AccountServiceImpl implements AccountService{

	/*****Inyectar Repositorio*****/
	@Autowired
	private AccountRepository accountRepository;
	
	
	@Override
	public List<Account> obtenerCuentasporUsuario(User user) {
		List<Account> cuentas = accountRepository.findAccountByUser(user);
		return cuentas;
	}
	
	
	

}
