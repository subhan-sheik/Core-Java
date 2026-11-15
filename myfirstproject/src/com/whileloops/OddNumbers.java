package com.whileloops;

import java.util.Scanner;

public class OddNumbers {
	static void odd(int n) {
		int i=1;
		while(i<=n) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
	}
	static void revrseOdd(int n) {
		int i=n;
		while(i>=1) {
			if(i%2==1) {
				System.out.println(i);
			}
			i--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		odd(n);
		System.out.println("*******************************");
		revrseOdd(n);
		sc.close();
	}

}
