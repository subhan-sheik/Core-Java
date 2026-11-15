package com.whileloops;

//decimal to binary
//Example: 10
//10 / 2 → quotient = 5, remainder = 0
//5  / 2 → quotient = 2, remainder = 1
//2  / 2 → quotient = 1, remainder = 0
//1  / 2 → quotient = 0, remainder = 1
//Remainders:0 1 0 1
//Reverse:1010
//So:10 → 1010

import java.util.Scanner;

public class DecimalToBinary {
	static void convertDecimalToBinary(int n) {
		if (n == 0) {
		    System.out.println("The Binary Value Of Given Number Is : "+n);
		    return;
		}
		int decimal=0;
		int place=1;
		while (n > 0) {
			int digit = n % 2;
			n = n / 2;
			decimal=decimal+digit*place;
			place=place*10;
		}if(n<0) {
			System.out.println("The Binary Value Of Given Number Is Invalid");
		}else {
		System.out.println("The Binary Value Of Given Number Is :" + decimal);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number Is :");
		int n=sc.nextInt();
		convertDecimalToBinary(n);
		sc.close();
	}

}
