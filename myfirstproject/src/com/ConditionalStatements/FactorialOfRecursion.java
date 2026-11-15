package com.ConditionalStatements;

import java.util.Scanner;

public class FactorialOfRecursion {
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Factorial Number :");
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println(" Factorial Number Is :"+result);
		sc.close();

	}

}
