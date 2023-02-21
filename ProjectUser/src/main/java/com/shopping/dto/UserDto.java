package com.shopping.dto;



public class UserDto {
	
    private int id;
	private String userName;
	private long userNumber;
	private String userPassword;
	private String userEmail;
	private String userAddress;
	private String userType;
	public UserDto() {
		super();
		
	}
	public UserDto(int id, String userName, long userNumber, String userPassword, String userEmail, String userAddress,
			String userType) {
		super();
		this.id = id;
		this.userName = userName;
		this.userNumber = userNumber;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
