package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.model.BankAccount;

//To give the definition of all crud operation first implement that interface
public class BankAccountImpl implements BankAccountDao {

	private Connection conn;

	public BankAccountImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public BankAccount getAccount(int accountId) {
		// TODO Auto-generated method stub
		// Parameterized query
		String sql = "Select * from BankAccount where accountId=?";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, accountId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				return new BankAccount(rs.getInt("accountId"), rs.getString("accountHolder"), rs.getDouble("balance"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean createAccount(BankAccount acc) {
		// TODO Auto-generated method stub
		String sql = "insert into BankAccount (accountId ,accountHolder,balance)values (?,?,?)";
		try {

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, acc.getAccountId());
			stmt.setString(2, acc.getAccountHolder());
			stmt.setDouble(3, acc.getBalance());

			return stmt.executeUpdate() > 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

	@Override
	public boolean deposit(int accountId, double amount) {
		// TODO Auto-generated method stub

		String sql = "update BankAccount set balance = balance + ? where accountId=?";
		return false;
	}

	@Override
	public boolean withdraw(int accountId, double amount) {
		// TODO Auto-generated method stub
		BankAccount account = getAccount(accountId);
		if (account != null && account.getBalance() >= amount) {
			String sql = "update BankAccount set balance = balance - ? where accountId=?";

		}

		return false;
	}

}