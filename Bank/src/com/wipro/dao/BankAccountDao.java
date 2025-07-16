package com.wipro.dao;

import com.wipro.model.BankAccount;

//Interface created for defining the crud operations 
public interface BankAccountDao {

	// To get the balance
	BankAccount getAccount(int accountId);

	// To create an Account
	boolean createAccount(BankAccount account);

	// To deposit the amount in an account
	boolean deposit(int accountId, double amount);

	// To withdraw the amount from an account
	boolean withdraw(int accountId, double amount);

}