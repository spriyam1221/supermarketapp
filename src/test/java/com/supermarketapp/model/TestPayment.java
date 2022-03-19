package com.supermarketapp.model;

public class TestPayment {

	public static void main(String[] args) {
		Payment payment = new Payment();
		
		payment.setItems("HammockSWings");
		payment.setPaymentOption("cash on delivery");
		payment.setPrice(2500);
		payment.setDeliveryCharge("Free");
		payment.setAmountpayable(2500);

		System.out.println(payment);

	}

}
