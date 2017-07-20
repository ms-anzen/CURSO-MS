package com.anzen.microservices.accounts.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.microservices.accounts.model.Account;

@RestController
public class AccountsController {
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<Account> getAll(){
		List<Account> cuentas = new ArrayList<Account>();
		
		cuentas.add(new Account(1, 1, "111111"));
		cuentas.add(new Account(1, 2, "222222"));
		cuentas.add(new Account(2, 1, "111111"));
		
		return cuentas;
	}
}
