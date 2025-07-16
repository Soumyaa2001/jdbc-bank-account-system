package com.wipro.model;

public class BankAccount {

	private int accountId;
	private String accountHolder;
	private double balance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accountId, String accountHolder, double balance) {
		super();
		this.accountId = accountId;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Getter & Setters
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {

		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ "]";
	}

}