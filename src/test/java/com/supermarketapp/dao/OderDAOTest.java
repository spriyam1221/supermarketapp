package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Order;

public class OderDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, USException {
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
	
		OrderDAO orderDAO = new OrderDAOImpl();
		orderDAO.summary(order);

	}

}
