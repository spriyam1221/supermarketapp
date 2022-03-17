package com.supermarketapp.validation;

import com.supermarketapp.model.Menu;

public class MenuValidation {
	public static void menuValidation(Menu menu) throws Exception {
		if(menu.getProductName()==null) {
			throw new Exception("product name is invalid");
		}
		else if (menu.getBrand()==null) {
			throw new Exception("brand name is invalid");
			}
		else if (menu.getQuantity()==null) {
			throw new Exception("quantity  is invalid");
		}
		else if (menu.getPrice()==0) {
			throw new Exception("price is invalid");
		}
		System.out.println("validation succesful");
}
}
