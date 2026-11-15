package com.ConditionalStatements;
//perfecg number menas A Perfect Number is a number whose proper factors (excluding the number itself) add up exactly to the number itself.

//ex: 6 
//factors of 6 =1,2,3,6 exclude 6 itself so add 1+2+3=6 so this is perfect number.
//why 10 is not perfect because 10 factors=1,2,5,10 exclude 10 itself so add 1+2+5=8 so this is not perfect number.
//perfect numbers are 6,28,496,8128

import java.util.Scanner;

public class PerfectNumber {
	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n = sc.nextInt();
		boolean result = isPerfect(n);
		if (result) {
			System.out.println("This Number Is a Perfect Number");
		} else {
			System.out.println("This Number Is ,Not a Perfect Number");
		}
		sc.close();

	}

}
