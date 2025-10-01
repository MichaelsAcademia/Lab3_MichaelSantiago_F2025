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
		
		System.out.println("ACCOUNTS CREATED");
		
		// Make a bank account with initial 1500
		BankAccount_MS account = new BankAccount_MS(3000, 1500);
	}

}
