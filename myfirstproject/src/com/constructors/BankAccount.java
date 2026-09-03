package com.constructors;

public class BankAccount {
	long accountNumber;
	String accountHolderName;
	double balance;
	String accountType;
	BankAccount(){
		this(4563453234l,"subhan sheik");
	}
	BankAccount(long accountNumber,String accountHolderName){
		this(accountNumber,accountHolderName,700000.0,"Savings");
	}

	BankAccount(long accountNumber, String accountHolderName, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	BankAccount(BankAccount b){
		accountNumber=b.accountNumber;
		accountHolderName=b.accountHolderName;
		balance=b.balance;
		accountType=b.accountType;
	}

	void displayBankDetails() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Holder Name :" + accountHolderName);
		System.out.println("Balance :" + balance);
		System.out.println("Account Type :" + accountType);
	}

	public static void main(String[] args) {
		BankAccount b1= new BankAccount();
		BankAccount b2= new BankAccount(b1);
		BankAccount b3 = new BankAccount(4563453234l, "subhan sheik", 700000.0, "Savings");
		b2.balance=900000.0;
		b1.displayBankDetails();
		System.out.println("--------------------------------------");
		b2.displayBankDetails();
		System.out.println("--------------------------------------");
		b3.displayBankDetails();

	}

}
