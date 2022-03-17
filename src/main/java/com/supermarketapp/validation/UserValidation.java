package com.supermarketapp.validation;

import com.supermarketapp.model.User;

public class UserValidation {

	/**
	 * this method is used to validate user validation
	 * @param user
	 * @throws Exception
	 */
	public static  void userValidation(User user) throws Exception {
		if (user.getName()==null) {
			throw new Exception("not a valid name");
		}
		else if (user.getEmail()==null) {
			throw new Exception ("not a valid email");
		}
		else if (user.getPassword()==null) {
			throw new Exception ("not a valid password");
		}
		else if (user.getMobileNumber()==null) {
			throw new Exception ("not a valid mobilenumber");
		}
		
		System.out.println("validation sucessful");
	}
}
