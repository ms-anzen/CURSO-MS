package com.anzen.repository.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.anzen.beans.AccountBean;
import com.anzen.models.Account;
import com.anzen.models.User;
import com.anzen.repository.AccountRepository;

/** Clase para manejo directo de los datos en memoria **/
@Repository
public class AccountRepositoryImpl implements AccountRepository{

	@Autowired
	private ApplicationContext context;
	
	
	@Override
	public List<Account> findAccountByUser(User user) {
		AccountBean accountBean = context.getBean(AccountBean.class);
		Map<String,List<Account>> userCuentas = accountBean.getAccounts();
		
		for (Entry<String, List<Account>> id : userCuentas.entrySet()){
			String clave = id.getKey();
			if(clave.equals(user.getId())){
				List<Account> cuentas = id.getValue();
				System.out.println(clave+"  ------->  ");
				return cuentas;
			}
		}
		return null;
	}

	
	
}
