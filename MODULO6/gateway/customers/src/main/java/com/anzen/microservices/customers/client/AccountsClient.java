package com.anzen.microservices.customers.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anzen.microservices.customers.model.Accounts;

@FeignClient(value="http://localhost:8081")
public interface AccountsClient {
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<Accounts> getAccounts();
}
