package com.whileloops;
//Input: 31573
//Output: 19
//Because: 3 + 1 + 5 + 7 + 3 = 19

import java.util.Scanner;

public class SumOfDigits {
	static int digits(int n) {
		int sum=0;
		while(n>0) {
			int digit =n%10;
			n=n/10;
			sum=sum+digit;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The NUmber :");
		int n=sc.nextInt();
		int result=digits(n);
		System.out.println("Sum Of Digits :"+result);
		sc.close();
	}

}
