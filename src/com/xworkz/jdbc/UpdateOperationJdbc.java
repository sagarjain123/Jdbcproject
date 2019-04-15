package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperationJdbc {

	public static void main(String[] args) {
		System.out.println("invoked a update operation");

		Connection connection = JdbcTest.getConnection();
		try {
			Statement statement = connection.createStatement();
			int id = statement.executeUpdate("update hibernate.watch set W_Name='fastrack' where Cost='300'");
			if (id == 1)
				System.out.println("succesfully updated");
			else
				System.out.println("not updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
