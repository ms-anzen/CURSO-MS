package com.anzen.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.anzen.beans.UserBean;
import com.anzen.models.User;
import com.anzen.repository.UserRepository;

/** Clase para manejo directo de los datos en memoria **/
@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private ApplicationContext context;
	
	@Override
	public List<User> findAllUsers() {
		UserBean userBean = context.getBean(UserBean.class);
		return userBean.getUsers();
	}

	@Override
	public void updateUser(User user) {
		UserBean userBean = context.getBean(UserBean.class);
		List<User> lista1 = userBean.getUsers();
		List<User> lista2 = new ArrayList<>();
		lista2.clear();
		/** Obtener el elemento a modificar y poblar la nueva lista**/
		for(User u:lista1){
			if(u.getUser().equals(user.getUser()) && u.getPass().equals(user.getPass())){
				lista2.add(user);
			}
			lista2.add(u);
		}
		
		/** setear el elemento en la lista **/
		userBean.setUsers(lista2);
		
	}

	@Override
	public User findById(String id) {
		UserBean userBean = context.getBean(UserBean.class);
		List<User> listUsers = userBean.getUsers();
		for(User u:listUsers){
			if(u.getId().equals(id)){
				return u;
			}
		}
		return null;
	}

}
