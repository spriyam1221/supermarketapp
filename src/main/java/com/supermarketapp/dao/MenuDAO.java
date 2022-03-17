package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Menu;

public interface MenuDAO {
	public void display(Menu menu) throws ClassNotFoundException, SQLException, USException ;
}
