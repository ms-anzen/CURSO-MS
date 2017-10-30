package com.anzen.digital.application;

import java.util.ArrayList;
import java.util.List;

import com.anzen.digital.models.User;


public class Cache {
	
	public static List<User> listUser;
	public static int contador=1;

	
	public static void loadUsers(){
		Cache.listUser = new ArrayList();
		Cache.listUser.add(new User(contador++,"Ana"));
		Cache.listUser.add(new User(contador++,"Karen"));
		Cache.listUser.add(new User(contador++,"Gaby"));
		Cache.listUser.add(new User(contador++,"Carmen"));
		Cache.listUser.add(new User(contador++,"Alicia"));
		Cache.listUser.add(new User(contador++,"Nancy"));
	}
}
