package com.supermarketapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.User;

public class UserDAOImpl implements UserDAO {

	/**
	 * this method is ued to register user details
	 */
	public void register(User user) throws USException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
					"rev_user");

			/*
			 * String url="jdbc:mysql://101.53.133.59.3306/revature_training_db"; String
			 * username="rev_user"; String password ="rev_user"; Connection
			 * connection=DriverManager.getConnection(url,username,password);
			 */

			String query = "INSERT INTO Super_Market_User (customer_id,NAME,email_id,PASSWORD,mobile_number) VALUES (?,?,?,?,?)";

			statement = connection.prepareStatement(query);
			statement.setInt(1, user.getCustomerId());
			statement.setString(2, user.getName());
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getMobileNumber());
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
	// public void login(User s1) {
	// SELECT * FROM SuperMarket_App_User WHERE email_id='priya@gmail.com' AND
	// PASSWORD ='priya12345';
//}
}
