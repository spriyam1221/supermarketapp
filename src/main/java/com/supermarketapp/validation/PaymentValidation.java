package com.supermarketapp.validation;

import com.supermarketapp.model.Payment;
import com.supermarketapp.model.User;

public class PaymentValidation {
	public static void PaymentVAlidation(Payment payment) throws Exception {
		if (payment.getitems() == null) {
			throw new Exception("items is invalid");
		} else if (payment.getPaymentOption() == null) {
			throw new Exception("not a valid payment option");
		} else if (payment.getPrice() == 0) {
			throw new Exception("amount is Invalid");
		} else if (payment.getDeliveryCharge() == null) {
			throw new Exception("Delivery charge is Invalid");
		} else if (payment.getAmountpayable() == 0) {
			throw new Exception("Invalid Amount ");
		}

		System.out.println("validation sucessful");
	}

}
