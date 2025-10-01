package com.ms.lab3;

public class SavingsAccount_MS extends BankAccount_MS {

	public SavingsAccount_MS(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		// If balance is under $50 then do not complete the transaction
		if ((balance - amount) < 50)
			throw new IllegalArgumentException("Cannot withdraw a value that would leave the balance < 50");
		
		balance -= amount;
	}
}
