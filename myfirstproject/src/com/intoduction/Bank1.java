package com.intoduction;

public class Bank1 {
	static String bankName="SBI";
	long accountNumber;
	int balance;
	void deposit() {
		//int add=5000;
		balance+=5000;
		System.out.println("Bank Name :"+bankName);
		System.out.println("After Deposit Amount:"+balance);
		checkBalance();
	}
	void withdraw() {
		int sub= 1000;
		balance-=sub;
		System.out.println("Before Deposit Amount:"+sub);
		checkBalance();
	}
	void checkBalance() {
		System.out.println("Check Balance :"+balance);
	}

	public static void main(String[] args) {
		Bank1 t1 =new Bank1();
		t1.accountNumber=5435787655l;
		t1.balance=500000;
		t1.deposit();
//		t1.checkBalance();
		t1.withdraw();
		System.out.println("**************************");
		Bank1 t2 =new Bank1();
		t2.accountNumber=8765487655l;
		t2.balance=300000;
		t2.deposit();
//		t2.checkBalance();
		t2.withdraw();


	}

}
