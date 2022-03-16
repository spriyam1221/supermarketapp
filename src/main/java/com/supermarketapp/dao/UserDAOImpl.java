package com.supermarketapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.supermarketapp.User;
import com.supermarketapp.exception.DBException;

public class UserDAOImpl implements UserDAO {

	public void register(User s1) throws DBException, SQLException{
		Connection connection=null;
		PreparedStatement statement=null;
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	   connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		/*String url="jdbc:mysql://101.53.133.59.3306/revature_training_db";
		 * String username="rev_user";
		 * String password ="rev_user";
		 * Connection connection=DriverManager.getConnection(url,username,password);
		 */
		
	   String query ="INSERT INTO Super_Market_User (customer_id,NAME,email_id,PASSWORD,mobile_number) VALUES (?,?,?,?,?)";		
				
		         statement= connection.prepareStatement(query);
                 statement.setInt(1, s1.getCustomerId());
				 statement.setString(2, s1.getName());
				 statement.setString(3, s1.getEmail());
				 statement.setString(4, s1.getPassword());
				 statement.setString(5, s1.getMobileNumber());
				// statement.setchar(1, s1.getGender());
				 int rows =statement.executeUpdate();
				 System.out.println(rows);
	          }
	          catch (ClassNotFoundException e) {
		
	        	e.printStackTrace();
		        throw new DBException (e.getMessage(),e);

	         }
		       finally {
				 if(statement!=null) {
				 statement.close();
				 }
				 if(connection!=null){
				 connection.close();
				 }
	}
	}
}
	
	


