package com.langfundamentals;

public class BankAccount {
	long accountNumber;
	String customerName;
	double balance;

	double deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit Amount :" + amount);
		return balance;
	}

	double withDraw(double wiAmount) {
		if (wiAmount <= balance) {
			balance = balance - wiAmount;
			System.out.println();
			System.out.println("WithDraw Amount :" + wiAmount);
		} else {
			System.out.println("Insufficient Balance ");
		}
		return balance;
	}

	void transfer(BankAccount anotherAccount, double amount) {
		if (amount <= balance) {
			this.balance = this.balance - amount;
			anotherAccount.balance = anotherAccount.balance + amount;
			System.out.println();
			System.out.println("Transfer Amount :" + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	double calculateInterest(double interestRate) {
		double interest = balance * interestRate / 100;
		return interest;
	}

	void customerDetails() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Customer Name :" + customerName);
		System.out.println("Balance:" + balance);
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		System.out.println("----------Account 1 Details------------");
		account1.accountNumber = 54876618;
		account1.customerName = "subhan sheik";
		account1.balance = 40000;
		account1.customerDetails();
		System.out.println("----------Account 2 Details------------");
		account2.accountNumber = 45677821;
		account2.customerName = "pavan koppula";
		account2.balance = 30000;
		account2.customerDetails();

		double deposit = account1.deposit(5000);
		System.out.println("After Deposit Amount :" + deposit);
		double withDraw = account1.withDraw(2000);
		System.out.println("After WithDraw Amount :" + withDraw);
		account1.transfer(account2, 1000);
		System.out.println("Account 1 Balace :" + account1.balance);
		System.out.println("Account 2 Balace :" + account2.balance);
		double interest = account1.calculateInterest(5);
		System.out.println("Interest :" + interest);
	}

}
