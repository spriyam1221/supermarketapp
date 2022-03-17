package com.supermarketapp.validation;

import com.supermarketapp.model.User;
import com.supermarketapp.validation.UserValidation;

public class UserValidationTest {
	public static void main(String[] args) throws Exception {
		User user= new User();
	     user.setCustomerId(1);
		user.setName("priya");
		user.setEmail("pri@gmail.com");
		user.setPassword("priya12345");
		user.setMobileNumber("8973279683");
		
		System.out.println(user);
	UserValidation.userValidation(user);
	}
}
