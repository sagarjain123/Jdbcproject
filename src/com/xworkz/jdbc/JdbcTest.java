package com.xworkz.jdbc;

import java.sql.*;

public class JdbcTest {

	public static Connection getConnection ()
	{
		Connection connection = null;
		try {
			System.out.println("invoked a common connection method");
			Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","dinga");
			 System.out.println("connection established");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
}
