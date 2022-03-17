package com.supermarketapp.model;

public class TestUser {

	public static void main(String[] args) {
	User s1 = new User();
	//	SuperMarketUser superMarketUser = new SuperMarketUser();
		s1.setCustomerId(1);
		s1.setName("priya");
		s1.setEmail("pri@gmail.com");
		s1.setPassword("priya12345");
		s1.setMobileNumber("8973279683");
		
		System.out.println(s1);
		
	}

}
