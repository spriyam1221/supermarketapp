package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.User;
import com.supermarketapp.exception.DBException;

public class UserDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, DBException {
		
		User s1 = new User();
		
			s1.setCustomerId(1);
			s1.setName("priya");
			s1.setEmail("pri@gmail.com");
			s1.setPassword("priya12345");
			s1.setMobileNumber("8973279683");
			//s1.setGender('F');
			System.out.println(s1);
			UserDAO userDAO = new UserDAOImpl();
			userDAO.register(s1);
			

	}

}
