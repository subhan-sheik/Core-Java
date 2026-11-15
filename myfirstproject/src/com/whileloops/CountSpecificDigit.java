package com.whileloops;
//Number: 1223242
//Digit: 2
//Output: 4

import java.util.Scanner;

public class CountSpecificDigit {
	static int countSpecificDigit(int n,int digit) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==digit) {
				count++;
			}
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		System.out.println("Enter Your Digit :");
		int num=sc.nextInt();
		int result=countSpecificDigit(n, num);
		System.out.println("Count Of Given Digit Count Is :"+result);
		sc.close();
	}

}
