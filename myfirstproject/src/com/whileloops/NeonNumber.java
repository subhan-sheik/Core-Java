package com.whileloops;

import java.util.Scanner;

//Write a Java program to check whether the given number is a Neon Number or not.
//Explanation:
//A number is called a Neon Number if the sum of the digits of its square is equal to the original number.
//For example, "9= 81 and 8 + 1 = 9, so 9" is a Neon Number.

public class NeonNumber {
	static boolean neonNumber(int n) {
		int r=0;
		int sum=0;
		int num=n;
		while(n>0){
			r=n%10;
			n=n/10;
			sum +=r*r;
			
		}
		int s=0;
		while(sum>0) {
			s=s+sum%10;
			sum/=10;
		}
		
		return s==num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n=sc.nextInt();
		boolean result=neonNumber(n);
		if(result) {
			System.out.println("Given Number Is Neon Number");
		}else {
			System.out.println("Given Number Is Not Neon Number");
		}
	}

}
