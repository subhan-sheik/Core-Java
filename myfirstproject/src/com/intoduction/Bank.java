package com.intoduction;

public class Bank {
	static  String BankName="sbi";
	static int n=1233426;
	 String accountHoldername;
	 String Ifsc ;
	 int balance;
	 void m2() {
		 System.out.println("Bank Name :" +BankName);
		 System.out.println("Account Number :" +n);
		 System.out.println("Account Holder Name :"+accountHoldername);
		 System.out.println("IFSC Number :" +Ifsc);
		 System.out.println("Balance :" +balance);
	 }
	 
	 {
		n++;
	}

	public static void main(String[] args) {
		Bank t1 =new Bank();
		t1.accountHoldername="sk.subhan";
		t1.Ifsc="SBINOOO567";
		t1.balance=50000;
		t1.m2();
		System.out.println("****************************");
		Bank t2 =new Bank();
		t2.accountHoldername="k.pavan";
		t2.Ifsc="SBINOOO677";
		t2.balance=40000;
		t2.m2();
	}

}
