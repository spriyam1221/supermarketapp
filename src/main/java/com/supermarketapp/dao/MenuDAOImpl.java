package com.supermarketapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Menu;

public class MenuDAOImpl implements MenuDAO {

	public void display(Menu menu) throws ClassNotFoundException, SQLException, USException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
					"rev_user");
		String query ="INSERT INTO SuperMarket_Menu(product_Name,brand,quantity,price)values(?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, menu.getProductName());
		statement.setString(2, menu.getBrand());
		statement.setString(3, menu.getQuantity());
		statement.setInt(4, menu.getPrice());
		
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

