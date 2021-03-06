package com.anzen.microservices.customers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anzen.microservices.customers.model.Customer;
import com.anzen.microservices.customers.service.CustomerService;

@RestController
public class CustomersController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
}
