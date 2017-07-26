package com.anzen.microservices.customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.anzen.microservices.customers.CustomersBean;
import com.anzen.microservices.customers.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<Customer> getCustomers() {
		CustomersBean customerBean = context.getBean(CustomersBean.class);
		
		return customerBean.getCustomer();
	}

	@Override
	public Customer getCustomer(int id) {
		CustomersBean customerBean = context.getBean(CustomersBean.class);
		
		return customerBean.getCustomer().get(id - 1);
	}
}
