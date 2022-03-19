package com.supermarketapp.dao;

import java.sql.SQLException;
import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Order;

public interface OrderDAO {
		 void summary(Order order ) throws ClassNotFoundException, SQLException,USException;

	}


