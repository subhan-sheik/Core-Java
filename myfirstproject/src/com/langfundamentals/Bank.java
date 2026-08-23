package com.langfundamentals;

public class Bank {
	static String bankName="Axis Bank";
	static int totalAccounts=3;
	int accountNumber;
	String accountHolder;
	double balance;
	void deposit() {
		int deposit=5000;
		balance+=deposit;
		System.out.println("Deposit :"+deposit);
	}
	void withDraw() {
		int withDraw=4000;
		balance-=withDraw;
		System.out.println("WithDraw :"+withDraw);
	}
	void calculateInterest() {
		double interest=balance%5;
		System.out.println("Interest :"+interest);
	}
	void displayAccount() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder :"+accountHolder);
		System.out.println("Balance :"+balance);
		deposit();
		withDraw();
		calculateInterest();
		System.out.println("--------------------------------------");
	}
	static void displayBankDetails() {
		System.out.println("Bank Name :"+bankName);
		System.out.println("Total Accounts :"+totalAccounts);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		displayBankDetails();
		b.accountNumber=5467432;
		b.accountHolder="subhan";
		b.balance=43000;
		b.displayAccount();
		b1.accountNumber=567523;
		b1.accountHolder="pavan";
		b1.balance=33000;
		b1.displayAccount();
		b2.accountNumber=5684732;
		b2.accountHolder="sai";
		b2.balance=37000;
		b2.displayAccount();
	}

}
