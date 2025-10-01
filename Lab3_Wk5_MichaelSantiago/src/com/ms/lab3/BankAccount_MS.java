package com.ms.lab3;

public class BankAccount_MS {

	protected int accountNumber;
	protected double balance;
	
	BankAccount_MS(int accountNumber, double balance){
		
		// If account number is <= 0 throw exception
		if (accountNumber <= 0)
			throw new IllegalArgumentException("Account Number cannot be <= 0");
		// If balance is < 0 throw exception
		if (balance < 0)
			throw new IllegalArgumentException("Account balance cannot be negative");

		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		// If amount is more than balance then do not complete the transaction
		if ((balance - amount) < 0)
			throw new IllegalArgumentException("Cannot withdraw more than balance amount");
		
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
