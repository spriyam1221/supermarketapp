package com.supermarketapp.validation;

import com.supermarketapp.model.Order;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OrderValidation {
	public static void OrderValidation(Order order) throws Exception {

		if (Order.getAddress() == null) {
			throw new Exception(" Address is invalid");
		} else if (Order.getCity() == null) {
			throw new Exception("City is invalid");
		} else if (Order.getPostalCode() == null) {
			throw new Exception("POstalCode is invalid");
		/*}else if (Order.getCountry() == null) {
			throw new Exception("Country is invalid"); */
		}else if (order.getItems() == null) {
			throw new Exception("invalid items");
		} else if (Order.getPrice() == 0) {
			throw new Exception("Price is Invalid");
		} else if (order.getDiscount() == null) {
			throw new Exception("youtr enter invalid discount");
		} else if (order.getDeliveryCharge() == null) {
			throw new Exception("Delivery Charges is invalid");
		} else if (order.getTotalAmount() == 0) {
			throw new Exception("Enter invalid amount");
		}
		System.out.println("validation Succesfull");
	}
}
