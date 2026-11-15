package com.ConditionalStatements;
//Recursion of reverse number means we give 12345 output is 54321

import java.util.Scanner;

public class RecursionRverseNumber {
	static int reverse = 0;

	static void reverseNumber(int n) {
		if (n == 0) {
			return;
		}
		int digit = n % 10;
		reverse = reverse * 10 + digit;
		reverseNumber(n / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num = sc.nextInt();
		reverseNumber(num);
		System.out.println(reverse);
		sc.close();
	}

}
