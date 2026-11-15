package com.whileloops;
//Input: 10
//Output: 30
//Because: 2 + 4 + 6 + 8 + 10 = 30

import java.util.Scanner;

public class SumOfNumbers {
	static int sum(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		int sumOfNumbers=sum(n);
		System.out.println("Sum Of Numbers Is :"+sumOfNumbers);
		sc.close();
	}

}
