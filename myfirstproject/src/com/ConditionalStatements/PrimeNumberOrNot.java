package com.ConditionalStatements;

import java.util.Scanner;

public class PrimeNumberOrNot {
	static boolean isPrime(int n) {
		int count = 0;
		if(n<2) {
			return false;
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				System.out.println(i);
			}
		}
		return count==2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("Is Prime Number ");
		} else {
			System.out.println("Is Not Prime Number");
		}
		sc.close();
	}

}
