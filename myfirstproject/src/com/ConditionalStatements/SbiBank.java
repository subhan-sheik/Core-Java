package com.ConditionalStatements;

import java.util.Scanner;

public class SbiBank {
	double balance=10000.0;
	 void checkBalance() {
		System.out.println("Your Current Balance :"+balance);
	}
	void withDraw(double wAmount) {
		if(wAmount<=balance) {
			balance=balance-wAmount;
			System.out.println("After Debit Your Balance is :"+balance);
		}else {
			System.err.println("Insufficient Funds In Your Account : Please Check Your Balance");
			checkBalance();
		}
	}
	void deposit(double dAmount) {
		if(dAmount <=100000) {
			balance=balance+dAmount;
			System.out.println("Your Total Balance is :"+balance);
		}else {
			System.err.println("Per Transcation Limikt Is 1 Lakh");
			checkBalance();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("-------Welcome to SBI Bank--------");
		Scanner sc =new Scanner(System.in);
		SbiBank b = new SbiBank();
		System.out.println("Enter The Amount Which You Want To WithDraw :");
		double withDrawAmount=sc.nextDouble();
		b.withDraw(withDrawAmount);
		System.out.println("Enter The Deposit Amount Which You Want To Deposit :");
		double depositAmount=sc.nextDouble();
		b.deposit(depositAmount);
	}
}
