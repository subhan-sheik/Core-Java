package com.whileloops;
//2. Write a Java Program to check the given number is AutoMorphic Number
//Ex:- Input :- 5
//         Output:-25 it’s automorphic number 
//Explanation:- A number called automorphic if the number and last digits of it’s square result are same 

import java.util.Scanner;

public class AutoMorphicNumber {
	static boolean isAutoMorphicNumber(int n) {
		int temp=n;
		int square=n*n;
		int divisor=1;
		while(temp>0) {
			divisor=divisor*10;
			temp=temp/10;
		}
		System.out.println(square);
		return square %divisor==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n=sc.nextInt();
		if(isAutoMorphicNumber(n)) {
			System.out.println("Is a AutoMorphic Number");
		}else {
			System.out.println("Is Not AutoMorphic Number");
		}
		
	}

}
