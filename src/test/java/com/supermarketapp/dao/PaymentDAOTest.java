package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Payment;

public class PaymentDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, USException {

		Payment payment = new Payment();

		payment.setItems("clock");
		payment.setPaymentOption("cash on delivery");
		payment.setPrice(1000);
		payment.setDeliveryCharge("Free");
		payment.setAmountpayable(1000);
		System.out.println(payment);

		PaymentDAO paymentDAO = new PaymentDAOImpl();
		paymentDAO.details(payment);
	}

}
