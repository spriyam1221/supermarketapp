package com.supermarketapp.model;

public class TestOrder {

	public static void main(String[] args) {
		Order order = new Order();
		//order.setCustomerName

		order.setCustomerName("priya");
		order.setContactNumber("8973279683");
		order.setAddress("MKM Nager,Gundy,Chennai");
		order.setCity("chengalpet");
		order.setPostalCode("603301");
		order.setCountry("india");
		
		System.out.println(order);
	}

	

}
