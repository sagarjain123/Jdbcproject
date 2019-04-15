package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FecthingValueFromDb {

	public static void main(String[] args) {
		Connection connection=JdbcTest.getConnection();
		
		try {
			Statement statement=connection.createStatement();
			
			ResultSet set=statement.executeQuery("select * from hibernate.watch");
			
			set.absolute(2);
			System.out.println(set.getString("W_Type"));
			System.out.println(set.getInt("W_Id"));
			
			System.out.println("successfully retrieved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
