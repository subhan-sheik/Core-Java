package com.whileloops;

//1. Write a Java program to check whether the given number is a Happy Number or not.
//Explanation
//A number is called a Happy Number if repeatedly replacing the number with the sum of the squares of its digits eventually results in 1
//If the process reaches "1, the given number is a Happy Number. Otherwise, it is not a Happy Number.

import java.util.Scanner;

public class HappyNumber {
	static int happyNumber(int n) {

		int r = 0;

		while (n != 1 && n != 4) {
			int sum = 0;
			while (n > 0) {// 91
				r = n % 10; // 82 -> 64+4 -> 68 ->36+64->100
				n = n / 10;//
				sum += r * r;
				System.out.println(sum);
			}
			n = sum;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		int num = happyNumber(n);
		if (num == 1) {
			System.out.println("Given Number Is Happy Number");
		} else {
			System.out.println("not happy number");
		}

		sc.close();
	}

}
