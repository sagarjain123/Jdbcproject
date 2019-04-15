package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperationJdbc {

	public static void main(String[] args) {
		Connection connection=JdbcTest.getConnection();
		System.out.println("invoked into delete");
		try {
			Statement statement=connection.createStatement();
			int id=statement.executeUpdate("delete from hibernate.watch where W_Name='fastrack'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
