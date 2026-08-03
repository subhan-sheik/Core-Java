package com.intoduction;
	
public class BankAccount{
	static String bankName="Axis Bank";
	long accountNumber;
	String accountHolderName;
	double balance;
	int deposit=10000;
	int withdraw=5000;
	void accountDetails() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Balance :"+balance);
	}
	void deposit() {
		balance+=deposit;
				System.out.println("Deposit The Amount :"+deposit);
				System.out.println("Updated Balance :"+balance);
	}
	void withDraw() {
		balance-=withdraw;
		System.out.println("WithDraw the Amount :"+withdraw);
		System.out.println("updated Balance :"+balance);
	}
	static void bank() {
		System.out.println("Bank Name :"+bankName);
	}
		
	public static void main(String[]args) {
		bank();
		BankAccount b=new BankAccount();
		BankAccount b1=new BankAccount();
		b.accountNumber=54673809637l;
		b.accountHolderName="subhan sheik";
		b.balance=20000;
		b.accountDetails();
		b.deposit();
		b.withDraw();
		System.out.println("----------------------------------------");
		b1.accountNumber=5446221337l;
		b1.accountHolderName="pavan koppula";
		b1.balance=50000;
		b1.accountDetails();
		b1.deposit();
		b1.withDraw();
	
	}

}
