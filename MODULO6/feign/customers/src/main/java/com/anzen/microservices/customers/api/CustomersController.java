package com.anzen.microservices.customers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.microservices.customers.client.AccountsClient;
import com.anzen.microservices.customers.model.Accounts;
import com.anzen.microservices.customers.model.Customer;
import com.anzen.microservices.customers.service.CustomerService;

@RestController
public class CustomersController {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private AccountsClient accountsClient;
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value="/customers/accounts/{id}", method=RequestMethod.GET)
	public List<Accounts> GetCustomerAccounts(@PathVariable("id") int id){
		return accountsClient.GetCustomerAccounts(id);
	}
}
