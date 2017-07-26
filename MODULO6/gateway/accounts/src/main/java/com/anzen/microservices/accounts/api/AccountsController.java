package com.anzen.microservices.accounts.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.microservices.accounts.model.Accounts;
import com.anzen.microservices.accounts.service.AccountsService;

@RestController
public class AccountsController {
	@Autowired
	private AccountsService accountsService;
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<Accounts> GetAccounts(){
		return accountsService.GetAccounts();
	}
	
	@RequestMapping(value="/accounts/{id}", method=RequestMethod.GET)
	public List<Accounts> GetCustomerAccounts(@PathVariable int id){
		return accountsService.GetCustomerAccounts(id);
	}
}
