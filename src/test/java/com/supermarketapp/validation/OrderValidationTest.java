package com.supermarketapp.validation;

import com.supermarketapp.model.Order;

public class OrderValidationTest {

	public static void main(String[] args) throws Exception {
		Order order = new Order();

		order.setAddress("MKM Nager,Gundy,Chennai");
		order.setCity("chengalpet");
		order.setPostalCode("603301");
		//order.setCountry("india");
		order.setItems("HammockSWings");
		order.setPrice(2500);
		order.setDiscount("5%");
		order.setDeliveryCharge("FreeDelivery");
		order.setTotalAmount(2500);
		System.out.println(order);
		OrderValidation.OrderValidation(order);
	}

}
