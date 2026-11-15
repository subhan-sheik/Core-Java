package com.ConditionalStatements;

import java.util.Scanner;

public class MathTable {
	static void math(int n) {
		int sum;
		for (int i = 1; i <= 12; i++) {
			sum = n * i;
			System.out.println(n + " X " + i + " = " + sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			math(i);
		}
		if(n>0) {
		}else {
			System.out.println("Invalid Number");
		}
		sc.close();
	}

}
