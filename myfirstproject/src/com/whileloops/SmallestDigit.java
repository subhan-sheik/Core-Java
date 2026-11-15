package com.whileloops;
//Input: 58321
//Output: 1

import java.util.Scanner;

public class SmallestDigit {
	static int smallDigit(int n) {
		int smaller =9;
		while(n>0) {
			int digit=n%10;
			if(digit<smaller) {
				smaller=digit;
			}
			n=n/10;
		}
		return smaller;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		int num=smallDigit(n);
		System.out.println("Smallerst Number Is :"+num);
		sc.close();
	}

}
