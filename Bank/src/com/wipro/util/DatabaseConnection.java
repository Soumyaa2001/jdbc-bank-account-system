package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	static Connection connection = null;

	public static Connection getConnection(String filename) throws Exception {
		try {
			// We have to fetch the properties
			String conn = DBPropertiesFile.getConnectionString(filename);
			// Iteration will take place internally using the split ()
			// String[] pair = new String(3);
			String[] pair = conn.split("\\|");
			String url = pair[0];
			String user = pair[1];
			String pass = pair[2];
			System.out.println(conn);
			connection = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.err.println("Database connection failed : " + e.getMessage());

		}
		return connection;

	}
}