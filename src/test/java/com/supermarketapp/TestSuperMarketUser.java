package com.supermarketapp;

public class TestSuperMarketUser {

	public static void main(String[] args) {
	SuperMarketUser s1 = new SuperMarketUser();
	//	SuperMarketUser superMarketUser = new SuperMarketUser();
		s1.setCustomerId(1);
		s1.setName("priya");
		s1.setEmail("pri@gmail.com");
		s1.setPassword("priya12345");
		s1.setMobileNumber("8973279683");
		s1.setGender('F');
		System.out.println(s1);
		
	}

}
