package com.ejercicio.dos.exesDosPrueba.Web;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dos.exesDosPrueba.domain.User;
import com.ejercicio.dos.exesDosPrueba.domain.Cuentas;

@RestController
public class Users {
	//private static Map<Integer,String> users=new HashMap<Integer,String>();

	private static List<String> mikeAccounts=new ArrayList<String>();
	private static  List<String> octavioAccounts=new ArrayList<String>();
	private static  List<String> miguelAccounts=new ArrayList<String>();
	
	private static List<User> users=new ArrayList<User>();
	private static List<Cuentas> accounts=new ArrayList<Cuentas>();
	
	
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> getUser(){
		users.clear();
		users.add(new User(1,"Miguel"));
		users.add(new User(2,"Octavio"));
		users.add(new User(3,"Jesus"));
		return users;
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {	
		for (User usuario:users) {
			if(usuario.getId()==id) {
				return usuario;
			}
		}		
		return null;
	}
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<Cuentas> getAccounts(){
		accounts.clear();
		mikeAccounts.clear();
		octavioAccounts.clear();
		miguelAccounts.clear();
		mikeAccounts.add("00111");
		mikeAccounts.add("00222");
		mikeAccounts.add("00333");
		
		octavioAccounts.add("00444");
		octavioAccounts.add("00555");
		octavioAccounts.add("00666");
		
		miguelAccounts.add("00777");
		miguelAccounts.add("00888");
		miguelAccounts.add("00999");
		
		accounts.add(new Cuentas(1,"Mike",mikeAccounts));		
		accounts.add(new Cuentas(2,"Octavio",octavioAccounts));
		accounts.add(new Cuentas(3,"Miguel",miguelAccounts));
	
		return accounts;
	}
	
	@RequestMapping(value="/accounts/{id}",method=RequestMethod.GET)
	public Cuentas getAccountById(@PathVariable("id")  int id){
		for (Cuentas account:accounts) {
			if(account.getId()==id) {
				return account;
			}
		}		
		return null;
	}
}
