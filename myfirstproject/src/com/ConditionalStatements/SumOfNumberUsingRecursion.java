package com.ConditionalStatements;
//sum of numbers using recrusion
// ex;5 means 5+4+3+2+1=15.

import java.util.Scanner;

public class SumOfNumberUsingRecursion {
	static int recr(int n) {
		if(n==1) {
			return 1;
		}
		return n+recr(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num=sc.nextInt();
		int result=recr(num);
		System.out.println(result);
		sc.close();

	}
}
