package com.green.bank.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	public static Connection openConnection() {
		Connection connection = null;
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Bank", "sa", "1");

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Where is your JDBC Driver?");
			e.printStackTrace();

		}

		return connection;

	}

	public static void main(String[] args) {
		System.out.println(openConnection());
	}
}
