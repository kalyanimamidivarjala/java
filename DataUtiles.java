package com.sathya.productmangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataUtiles {
	public static Connection createConnection()
	{	Connection connection = null; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/kalyani","root","root");
		}
		catch(ClassNotFoundException | SQLException e)
		{	e.printStackTrace();
		}
		return connection;
	}	
}
