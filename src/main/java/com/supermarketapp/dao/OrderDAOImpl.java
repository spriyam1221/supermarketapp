package com.supermarketapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Order;

public class OrderDAOImpl implements OrderDAO {

	public void summary(Order order) throws ClassNotFoundException, SQLException, USException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
					"rev_user");
			String query = "INSERT INTO SuperMarket_Order_Summary(address,city,postal_code, items,price,discount,delivery_charges,total_amount)values(?,?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(query);
			statement.setString(1, Order.getAddress());
			statement.setString(2, Order.getCity());
			statement.setString(3, Order.getPostalCode());
		//	statement.setString(4, Order.getCountry());
			statement.setString(4, order.getItems());
			statement.setInt(5, Order.getPrice());
			statement.setString(6, order.getDiscount());
			statement.setString(7, order.getDeliveryCharge());
			statement.setInt(8, order.getTotalAmount());

			int rows = statement.executeUpdate();
			System.out.println(rows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new USException(e.getMessage(), e);

		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}

		}
	}

}
