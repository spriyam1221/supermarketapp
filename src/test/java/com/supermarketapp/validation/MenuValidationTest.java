package com.supermarketapp.validation;

import com.supermarketapp.model.Menu;

public class MenuValidationTest {

	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		menu.setProductName("rice");
		menu.setBrand("ponni");
		menu.setQuantity("10kg");
		menu.setPrice(1000);
		System.out.println(menu);
		MenuValidation.menuValidation(menu);

	}

}
