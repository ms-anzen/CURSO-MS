package com.anzen.microservices.accounts.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.microservices.accounts.model.Accounts;

@RestController
public class AccountsController {
	@RequestMapping(value="/accounts/{id}", method=RequestMethod.GET)
	public List<Accounts> getAll(){
		List<Accounts> cuentas = new ArrayList<Accounts>();
		
		
		
		return cuentas;
	}
}
