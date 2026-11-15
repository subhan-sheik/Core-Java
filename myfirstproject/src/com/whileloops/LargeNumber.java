package com.whileloops;
//Input: 58321
//Output: 8

import java.util.Scanner;

public class LargeNumber {
	static int largeNumber(int n) {
		int largest=0;
		while(n>0) {
			int digit=n%10;
			if(digit>largest) {
				largest=digit;
			}
			n=n/10;
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		int result=largeNumber(n);
		System.out.println("Large Number Is :"+result);
		sc.close();
	}

}
