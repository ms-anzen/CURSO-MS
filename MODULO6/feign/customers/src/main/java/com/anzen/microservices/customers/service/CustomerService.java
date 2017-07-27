package com.anzen.microservices.customers.service;

import java.util.List;

import com.anzen.microservices.customers.model.Accounts;
import com.anzen.microservices.customers.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
}
