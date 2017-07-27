package com.anzen.microservices.customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.anzen.microservices.customers.model.Customer;

@Component
public class CustomersBean {
	private List<Customer> customers = new ArrayList<Customer>();

	public List<Customer> getCustomer() {
		return customers;
	}

	public void setCustomer(List<Customer> customers) {
		this.customers = customers;
	}	
}
