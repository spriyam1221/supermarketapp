package com.supermarketapp.dao;

import java.sql.SQLException;

import com.supermarketapp.exception.USException;
import com.supermarketapp.model.Payment;

public interface PaymentDAO {
	    void details(Payment payment)throws ClassNotFoundException, SQLException,USException;


}
