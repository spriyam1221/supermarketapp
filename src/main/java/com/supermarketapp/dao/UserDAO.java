package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.User;

import com.supermarketapp.exception.DBException;

public interface UserDAO {
	 void register(User s1 ) throws ClassNotFoundException, SQLException,DBException;

}
 