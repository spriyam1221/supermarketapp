package com.supermarketapp.model;

public class User {
 
	private  Integer CustomerId;
	private String name;
	private String email;
	private String password;
	private String mobileNumber;
	
	public Integer getCustomerId() {
		return CustomerId;
	}
	public  void setCustomerId(Integer customerId) {
		this.CustomerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "User [CustomerId=" + CustomerId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
