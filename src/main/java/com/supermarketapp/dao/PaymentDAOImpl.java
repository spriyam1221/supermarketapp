package com.supermarketapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Payment;

public class PaymentDAOImpl implements PaymentDAO {
	public void details(Payment payment) throws USException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
					"rev_user");

			String query = "INSERT INTO Super_Market_Payment(items,payment_option,Price,delivery_charges,amount_payable) VALUES (?,?,?,?,?)";

			statement = connection.prepareStatement(query);
			statement.setString(1,payment.getitems());
			statement.setString(2, payment.getPaymentOption());
			statement.setInt(3, payment.getPrice());
			statement.setString(4, payment.getDeliveryCharge());
			statement.setInt(5, payment.getAmountpayable());

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
