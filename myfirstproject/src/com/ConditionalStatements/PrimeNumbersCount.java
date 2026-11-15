package com.ConditionalStatements;

import java.util.Scanner;

public class PrimeNumbersCount {
	static boolean primeNumber(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2;
	}
	static int primeCount(int n) {
		int count =0;
		for(int i=2;i<=n;i++) {
			if(primeNumber(i)) {
				System.out.println(i);
				count++;	
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n=sc.nextInt();
		int result=primeCount(n);
		System.out.println("Prime Number Count :"+result);
		sc.close();
		
	}

}
