package com.wipro.util;

import java.util.Properties;
import java.io.FileInputStream;

public class DBPropertiesFile {

	// for configuring the database
	// instead of hard coding the credentials for security reason

	public static String getConnectionString(String filename) throws Exception {

		// create an object of Properties class to get the properties from a file
		Properties props = new Properties();
		// Take the input from a file
		props.load(new FileInputStream(filename));

		// Fetch all the properties from the file on the basis of key
		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String password = props.getProperty("db.password");

		return url + "|" + user + "|" + password;

	}

}