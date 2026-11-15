package com.ConditionalStatements;

import java.util.Scanner;

public class AlphabetCharactersEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		char a = 'A';
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(a + " ");
			} 
			
			a++;
		}
		if (num <= 0) {
			System.out.println("Invalid Character....Alphabets are Starts With 1 Not 0");
			return;
		}

	}

}
