package com.xworkz.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

	static Statement statement;
	public static void main(String[] args) {
		
		Connection connection=JdbcTest.getConnection();
		
		
		try {
			statement=connection.createStatement();
			String query1="insert into hibernate.watch values(6,'aravind','sagar',300),(7,'pavan','hulk',400)";
			String query2="update hibernate.watch set W_Type='classic' where W_Id=5";
			String query3="delete from hibernate.watch where W_Name='titan'";
			
			statement.addBatch(query1);
			statement.addBatch(query2);
			statement.addBatch(query3);
			
			int[] result=statement.executeBatch();
			for(int i:result)
			{
				System.out.println(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
