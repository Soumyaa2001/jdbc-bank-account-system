// Create a project of student management system that in a batch you want to add ,delete , view the student details
// student.java -- id,name,age,batchid --- constructor , getter/setter
// studentdao.java-- add() , delete(),view()
// studentdaoImpl -- businesslogic of add , delete and view
//StudentMain --- you will calling the methods studentdao d = new studentdaoImpl();
//databaseconnection and dbproperties , db.properties

package com.wipro.main;

import java.sql.Connection;

import com.wipro.dao.BankAccountDao;
import com.wipro.dao.BankAccountImpl;
import com.wipro.model.BankAccount;
import com.wipro.util.DatabaseConnection;

public class BankMain {

	public static void main(String[] args) throws Exception {

		/*
		 * 1.Through BankMain.Java it will call DatabaseConnection you have called
		 * getConnection method by passing the db.properties file location 2. Internally
		 * it will fetch the properties from DBPropertiesFile String conn =
		 * DBPropertiesFile.getConnectionString(filename); which is returning the url ,
		 * user and pass and returning to DatabaseConnection which is returning the
		 * connection object 3. and return back to the BankMain.java
		 */

		Connection conn = DatabaseConnection.getConnection("resources/db.properties");
		System.out.println("Connection Established");

		BankAccountDao dao = new BankAccountImpl(conn);

		BankAccount result = dao.getAccount(1001);
		System.out.println("Final Balance : " + result.getBalance());

		BankAccount acc = new BankAccount(1002, "Jatin", 3000);
		dao.createAccount(acc);
	}

}