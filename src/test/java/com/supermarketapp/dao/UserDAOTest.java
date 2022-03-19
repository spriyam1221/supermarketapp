package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.dao.UserDAO;
import com.supermarketapp.dao.UserDAOImpl;
import com.supermarketapp.exception.USException;
import com.supermarketapp.model.User;

public class UserDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, USException {

		User user = new User();

		user.setCustomerId(5);
		user.setName("Anubu");
		user.setEmail("Anubu@gmail.com");
		user.setPassword("Anubu12345");
		user.setMobileNumber("7333787883");
		System.out.println(user);
		
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);

	}

}
