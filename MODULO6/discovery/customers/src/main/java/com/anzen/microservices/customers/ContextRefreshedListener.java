package com.anzen.microservices.customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.anzen.microservices.customers.CustomersBean;
import com.anzen.microservices.customers.model.Customer;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	private CustomersBean customersBean;

    @Autowired
    public void setCustomersBean(CustomersBean customersBean) {
        this.customersBean = customersBean;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {               
        List<Customer> globalCustomers = new ArrayList<Customer>();
        
        globalCustomers.add(new Customer(1, "miguel"));
        globalCustomers.add(new Customer(2, "oscar"));
        globalCustomers.add(new Customer(3, "issaac"));
        globalCustomers.add(new Customer(4, "sandia"));
        globalCustomers.add(new Customer(5, "sandra"));
        
        customersBean.setCustomer(globalCustomers);
        
        for (Customer c : customersBean.getCustomer()) {
        	System.out.println(c.getId() + " - " + c.getName());
        }
    }
}
