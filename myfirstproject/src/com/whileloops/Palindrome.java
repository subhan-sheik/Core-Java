package com.whileloops;
//Input: 121
//Output: Palindrome
//because 121 reverse is same so this is palindrome.

import java.util.Scanner;

public class Palindrome {
	static boolean isPlaindrome(int n) {
		boolean status=false;
		int reverse=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			n=n/10;
			reverse=reverse*10+digit;
		}
		if(reverse==temp) {
			status=true;
		}
		return status ;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number :");
		int n=sc.nextInt();
		boolean num=isPlaindrome(n);
		if(num) {
			System.out.println("Given Number Is Palindrome");
		}else {
			System.out.println("Given Number Is Not Palindrome");
		}
		sc.close();
	}

}
