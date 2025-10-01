package com.ms.lab3;

public class BankAccount_MS {

	protected int accountNumber;
	protected double balance;
	
	BankAccount_MS(int accountNumber, double balance){
		
		if (accountNumber <= 0)
			throw new IllegalArgumentException("Account Number cannot be <= 0");
	
		if (balance < 0)
			throw new IllegalArgumentException("Account balance cannot be negative");

		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if ((balance - amount) < 0)
			throw new IllegalArgumentException("Cannot withdraw more than balance amount");
		
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
