package com.supermarketapp.model;

public class TestMenu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setProductName("rice");
		menu.setBrand("ponni");
		menu.setQuantity("1kg");
		menu.setPrice(1000);
		System.out.println(menu);
	}

}
