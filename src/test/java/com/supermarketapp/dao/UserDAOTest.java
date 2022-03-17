package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.dao.UserDAO;
import com.supermarketapp.dao.UserDAOImpl;
import com.supermarketapp.exception.USException;
import com.supermarketapp.model.User;

public class UserDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, USException {

		User user = new User();

		user.setCustomerId(4);
		user.setName("Anu");
		user.setEmail("Anu@gmail.com");
		user.setPassword("Anu12345");
		user.setMobileNumber("7333769883");
		System.out.println(user);
		
		UserDAO userDAO = new UserDAOImpl();
		userDAO.register(user);

	}

}
