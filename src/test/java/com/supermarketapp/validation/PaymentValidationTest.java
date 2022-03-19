package com.supermarketapp.validation;

import com.supermarketapp.model.Payment;

public class PaymentValidationTest {

	public static void main(String[] args) throws Exception {

		Payment payment = new Payment();
		payment.setItems("HammockSWings");
		payment.setPaymentOption("cash on delivery");
		payment.setPrice(2500);
		payment.setDeliveryCharge("Free");
		payment.setAmountpayable(2500);
		System.out.println(payment);
		PaymentValidation.PaymentVAlidation(payment);

	}

}
