package com.ConditionalStatements;
//nth prime number using for loop.
//input:4
//ouput:2357

import java.util.Scanner;

public class NthPrimeNumber {
	static boolean prime(int x) {
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				count++;
			}
		}
		return count==2;
	}
	static void printNumber(int y) {
		int sum=0;
		for(int number=2;sum<y;number++) {
			if(prime(number)) {
			System.out.print(number+" ");
			sum++;
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Prime Number :");
		int n=sc.nextInt();
		printNumber(n);
		sc.close();
		
	}

}
