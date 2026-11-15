package com.whileloops;

//alternative even numbers 
// means 123456789=2 and 6 are alternative even numbers
import java.util.Scanner;

public class AlternativeEvenNumber {
	static void isEven(int n) {
		int i=2;
		while(i<=n) {
			System.out.print(i+" ");
			i=i+4;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=sc.nextInt();
		isEven(n);
		sc.close();
	}

}
