package com.whileloops;
//1. Write a Java Program to find the Single digit , double digit , triple digit  upto length prime numbers of a given number 
//Ex:- 12131456
//Output :- 2,3,5,31,13,…. Upto length 

import java.util.Scanner;

public class LengthPrimeNumber {
	static boolean isPrime(int n) {
		int count=0;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		return count==2;
	}
	static int countDigits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	static void printPrimes(int n) {
		int length=countDigits(n);
		int digitLength=1;
		int start=1;
		while(digitLength<=length) {
			int end=start*10-1;
			if(end>n) {
				end=n;
			}
			System.out.println("\n"+digitLength+ " Digit Prime Numbers:");
			int i=start;
			while(i<=end) {
				if(isPrime(i)) {
					System.out.print(i+" ");
				}
				i++;
			}
			start=start*10;
			digitLength++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The  Number :");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("Is a Prime Number");
		}else {
			System.out.println("Is Not A Prime Number");
		}
		printPrimes(n);
		sc.close();
	}

}
