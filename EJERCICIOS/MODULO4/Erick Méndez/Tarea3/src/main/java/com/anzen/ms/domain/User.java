package com.anzen.ms.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_user")
	private int idUser;
	private String name;
	private String lastname;
	@Column(name = "user_name")
	private String userName;
	private String password;
	@Temporal(TemporalType.DATE)
	@Column(name = "last_login")
	private Date lastLogin;
	@OneToMany(mappedBy = "owner")
	private List<Account> accounts;

	public User() {

	}

	public User(String name, String lastname, String userName, String password, Date lastLogin) {
		this.name = name;
		this.lastname = lastname;
		this.userName = userName;
		this.password = password;
		this.lastLogin = lastLogin;
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", lastname=" + lastname + ", userName=" + userName
				+ ", password=" + password + ", lastLogin=" + lastLogin + "]";
	}

}
