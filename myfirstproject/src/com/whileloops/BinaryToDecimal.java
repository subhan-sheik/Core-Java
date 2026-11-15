package com.whileloops;

import java.util.Scanner;

public class BinaryToDecimal {
	static void convertBinaryToDecimal(int n) {
		int decimal = 0;
		int power = 1;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			decimal = decimal + digit * power;
			power = power * 2;
		}
		System.out.println(decimal);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Digits :");
		int n = sc.nextInt();
		convertBinaryToDecimal(n);
		sc.close();
	}

}
