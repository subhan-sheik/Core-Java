package com.whileloops;
//Input: 246813
//Even digits: 2 + 4 + 6 + 8 = 20
//Odd digits: 1 + 3 = 4
//evendigits-odddigits= 20-4=16
//Output: 16

import java.util.Scanner;

public class subtractOfEvenAndOddDigits {
	static int count(int n) {
		int evenSum=0;
		int oddSum=0;
		int total=0;
		while(n>0) {
			int digit=n%10;
			if(digit%2==0) {
				evenSum=evenSum+digit;
			}else {
				oddSum=oddSum+digit;
			}
			n=n/10;
		}
		total=evenSum-oddSum;
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n = sc.nextInt();
		int result=count(n);
		System.out.println("Subtract Of Even And Odd Digits :"+result);
		sc.close();
	}

}
