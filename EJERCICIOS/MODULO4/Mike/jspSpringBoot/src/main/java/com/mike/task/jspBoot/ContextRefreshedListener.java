package com.mike.task.jspBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.mike.task.jspBoot.web.domain.User;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	private UserBean userBean;
	
    @Autowired
    public void setEventHolderBean(UserBean userBean) {
        this.userBean = userBean;
    }
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {               
        List<User> users = new ArrayList<User>();
    
    	users.add(new User(1, "mike", "chilenas"));
    	users.add(new User(2, "oscar", "password"));
    	users.add(new User(3, "paty", "password"));
    	
    	userBean.setUsers(users);              
    }
}
