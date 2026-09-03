package com.langfundamentals;

public class Demo8 {
	int accountNumber;
	String accountHolderName;
	double balance;
	String accountType;

	Demo8(int accountNumber,String accountHolderName,double balance,String accountType) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.accountType=accountType;

	}
	void display() {
		System.out.println("account Number :"+accountNumber);
		System.out.println("account HolderName :"+accountHolderName);
		System.out.println("balance :"+balance);
		System.out.println("accountType :"+accountType);
	}

	public static void main(String[] args) {
		Demo8 d = new Demo8(101,"subhan",30000.0,"savings");
		Demo8 d1=new Demo8(102,"pavan",40000.0,"current");
		d.display();
		System.out.println("--------------------------------------");
		d1.display();
		
	}

}
