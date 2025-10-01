package com.ms.lab3;

import java.util.Scanner;

public class DriverMainClass_MichaelSantiago {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Create 3 Accounts Dynamically
		BankAccount_MS[] accounts = new BankAccount_MS[3];
		
		for(int acc = 0; acc < 3; acc++){
			int currAcc = acc + 1;
			int accType = 0;
			
			// Let user choose type of account
			while (accType <= 0 || accType >= 3) {
				System.out.println(
						"Which type of account would you like?\n"
						+ "Bank Account - 1\n"
						+ "Savings Account - 2"		
				);
				accType = sc.nextInt();
				
				// If account is out of scope for answer tell them
				if (accType <= 0 || accType >= 3)
					System.out.println("Please only enter 1, or 2");
			}
			
			// Account number
			System.out.printf("Please enter account %d's account number\n", currAcc);
			int accNum = sc.nextInt();
			
			// Account balance
			System.out.printf("Please enter account %d's balance\n", currAcc);
			Double accBal = sc.nextDouble();
			
			// Make certain account depending on user input
			switch(accType) {
				case 1:
					accounts[acc] = new BankAccount_MS(accNum, accBal);
					System.out.printf("Bank account %d created\n", accNum);
					break;
				case 2:
					accounts[acc] = new SavingsAccount_MS(accNum, accBal);
					System.out.printf("Savings account %d created\n", accNum);
					break;
			}
		}
		
		// Close Scanner
		sc.close();
		
		System.out.println("Starting run tests");
		
		// Run 1
		System.out.println("Run 1");
		
		// Make a bank account with initial 1500
		BankAccount_MS acc1 = new BankAccount_MS(3000, 1500);
		System.out.println("Created bank account with 1500 balance");
		
		// Deposit 1500
		System.out.println("Depositing 1500");
		
		acc1.deposit(1500);
		
		System.out.printf("New balance after deposit - %.2f\n", acc1.getBalance());
		
		// Run 2
		System.out.println("Run 2");
		
		// Withdraw 600
		System.out.println("Withdrawing 600");
		
		acc1.withdraw(600);
		
		System.out.printf("New balance after Withdraw - %.2f\n", acc1.getBalance());
		
		// Run 3
		System.out.println("Starting Run 3");
		
		// Withdraw 2500
		System.out.println("Attempting to withdraw 2500 from account");
		
		acc1.withdraw(2500);
	}

}
