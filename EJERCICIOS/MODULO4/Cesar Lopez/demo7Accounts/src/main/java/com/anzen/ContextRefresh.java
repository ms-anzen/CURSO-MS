package com.anzen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.anzen.beans.AccountBean;
import com.anzen.beans.UserBean;
import com.anzen.models.Account;
import com.anzen.models.User;

@Component
public class ContextRefresh implements ApplicationListener<ContextRefreshedEvent> {

	private UserBean userBean;
	private AccountBean accountBean;
	
	/**Setea bines **/
    @Autowired
    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
    
    @Autowired
    public void setAccountBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }
	
	/** inicializa objetos **/
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
	    
		/** inicializar los Usuarios y las cuentas **/
    	users.add(new User("1","cesar", "lopez"));
    	users.add(new User("2","ivan", "martinez"));
    	users.add(new User("3","mary", "morales"));
    	userBean.setUsers(users);
    	
    	Map<String, List<Account>> userAccounts = new HashMap<String,List<Account>>();
    	
    	List<Account> accountsUserA = new ArrayList<Account>();
    	List<Account> accountsUserB = new ArrayList<Account>();
    	List<Account> accountsUserC = new ArrayList<Account>();
    	
    	accountsUserA.add(new Account("11111111", "UserA1", "ChequeraA"));
    	accountsUserA.add(new Account("11111112", "UserA2", "Tarjeta Debito"));
    	accountsUserA.add(new Account("11111113", "UserA3", "Tarjeta Credito"));
    	
    	accountsUserB.add(new Account("22222222", "UserB1", "ChequeraB"));
    	accountsUserB.add(new Account("22222222", "UserB2", "Tarjeta Debito"));
    	accountsUserB.add(new Account("22222223", "UserB3", "Tarjeta Credito"));
    	
    	accountsUserC.add(new Account("33333331", "UserB1", "ChequeraC"));
    	accountsUserC.add(new Account("33333332", "UserB2", "Tarjeta Debito"));
    	accountsUserC.add(new Account("33333333", "UserB3", "Tarjeta Credito"));
    	
    	userAccounts.put("1", accountsUserA);
    	userAccounts.put("2", accountsUserB);
    	userAccounts.put("3", accountsUserC);
    	
    	accountBean.setAccounts(userAccounts);
	}
	
	

}
