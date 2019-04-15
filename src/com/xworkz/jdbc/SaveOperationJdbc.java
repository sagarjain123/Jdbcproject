package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveOperationJdbc {
	
	public static void main(String[] args) {
		
		System.out.println("Invoked a sav method");
		Connection connection=JdbcTest.getConnection();
		
		try {
			Statement statement=connection.createStatement();
			
			//boolean set=statement.execute("insert into hibernate.watch values(1,'rado','digital',300)");
			
			boolean set=statement.execute("insert into hibernate.watch values(2,'rolex','analog',200),(3,'titan','digital',400)");

			if(!set)
			{
				System.out.println("watch is created....");
			}
			else
			{
				System.out.println("watch not created");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
