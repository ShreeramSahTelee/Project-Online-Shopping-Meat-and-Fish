package com.shopping.entity;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user50")
public class User {
	@Id
	private int id;
	private String userName;
	@Indexed(unique = true)
	private long userNumber;
	
	@Indexed(unique = true)
	private String userEmail;
	private String UserPassword;
	private String userAddress;
	private String userType;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, long userNumber, String userEmail, String userPassword, String userAddress,
			String userType) {
		super();
		this.id = id;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userEmail = userEmail;
		UserPassword = userPassword;
		this.userAddress = userAddress;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(long userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	
}
