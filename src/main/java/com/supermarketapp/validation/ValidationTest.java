package com.supermarketapp.validation;

import com.supermarketapp.User;

public class ValidationTest {
	public static void main(String[] args) throws Exception {
		User s1 = new User();
		s1.setCustomerId(1);
		s1.setName("priya");
		s1.setEmail("pri@gmail.com");
		s1.setPassword("priya12345");
		s1.setMobileNumber("8973279683");
	//	s1.setGender('F');
		System.out.println(s1);
	UserValidation.UserValidation(s1);
	}
}
