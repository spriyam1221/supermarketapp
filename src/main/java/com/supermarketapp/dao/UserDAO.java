package com.supermarketapp.dao;

import java.sql.SQLException;
import com.supermarketapp.exception.USException;
import com.supermarketapp.model.User;

public interface UserDAO {
	 void register(User user ) throws ClassNotFoundException, SQLException,USException;

}
 