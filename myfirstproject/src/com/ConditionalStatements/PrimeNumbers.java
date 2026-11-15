package com.ConditionalStatements;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean primeNumber(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	static void printPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			if (primeNumber(n)) {
				System.out.println(i);
			} else {
				System.out.println("Is Not Prime Number");
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter THe Number :");
		int n = sc.nextInt();
		printPrimeNumbers(n);
		sc.close();
	}
}
