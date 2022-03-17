package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.User;
import com.supermarketapp.exception.DBException;

public class UserDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, DBException {
		
		User s1 = new User();
		
			s1.setCustomerId(3);
			s1.setName("prithi");
			s1.setEmail("prithi@gmail.com");
			s1.setPassword("prithi12345");
			s1.setMobileNumber("7333279883");
			System.out.println(s1);
			UserDAO userDAO = new UserDAOImpl();
			userDAO.register(s1);
			

	}

}
