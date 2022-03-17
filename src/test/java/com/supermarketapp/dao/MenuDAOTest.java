package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Menu;

public class MenuDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, USException {
		Menu menu = new Menu();
		
		menu.setProductName("iceCream");
		menu.setBrand("Arun");
		menu.setQuantity("2");
		menu.setPrice(60);
		
		System.out.println(menu);
		
		MenuDAO menuDAO = new MenuDAOImpl();
		menuDAO.display(menu);
	}

}
