package com.anzen.microservices.customers.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anzen.microservices.customers.model.Accounts;

@FeignClient("account-service")
public interface AccountsClient {
	@RequestMapping(value="/accounts/{id}", method=RequestMethod.GET)
	public List<Accounts> GetCustomerAccounts(@PathVariable("id") int id);
}
