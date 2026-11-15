package com.whileloops;

import java.util.Scanner;

public class EvenNumbers {
	static void even(int n) {
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	static void reverse(int n) {
		int i=n;
		while(i>=1) {
			if(i%2==0) {
				System.out.println(i);
			}
			i--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		even(n);
		System.out.println("**********************");
		reverse(n);
		sc.close();
	}

}
