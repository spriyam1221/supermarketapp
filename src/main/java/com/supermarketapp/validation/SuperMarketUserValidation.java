package com.supermarketapp.validation;

import com.supermarketapp.SuperMarketUser;

public class SuperMarketUserValidation {

	public static  void UserValidation(SuperMarketUser s1) throws Exception {
		if (s1.getName()==null) {
			throw new Exception("not a valid name");
		}
		else if (s1.getEmail()==null) {
			throw new Exception ("not a valid email");
		}
		else if (s1.getPassword()==null) {
			throw new Exception ("not a valid password");
		}
		else if (s1.getMobileNumber()==null) {
			throw new Exception ("not a valid mobilenumber");
		}
		//else if (s1.getGender()==null){
		//	throw new Exception ("Whether Check your genger");
			
		//}
		System.out.println("validation sucessful");
	}
}
