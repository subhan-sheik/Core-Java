package com.ConditionalStatements;

import java.util.Scanner;

public class StrongNumber {
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static int strong(int n) {
		int sum=0;
		for(int i=n;i>0;i=i/10) {
			int digit=i%10;
			sum=sum+factorial(digit);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n=sc.nextInt();
//		int result=strong(n);
//		System.out.println(result);
		int orginal=strong(n);
		if(orginal==n) {
			System.out.println("Strong number");
			return;
		}
		System.out.println("THis Number Is not Strong Number");
		sc.close();
	}

}
