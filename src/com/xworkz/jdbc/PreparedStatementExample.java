package com.xworkz.jdbc;

import java.sql.*;

public class PreparedStatementExample {

	public static void main(String[] args) {
		
		try {
			
			Connection connection=JdbcTest.getConnection();
			
			String query="insert into hibernate.watch values(?,?,?,?)";
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setInt(1, 20);
			preparedStatement.setString(2, "angular");
			preparedStatement.setString(3, "civil");
			preparedStatement.setInt(4, 600);
			
			boolean result=preparedStatement.execute();
			if(result)
			{
				System.out.println("not inserted");
			}
			else
			{
				System.out.println("inserted successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
