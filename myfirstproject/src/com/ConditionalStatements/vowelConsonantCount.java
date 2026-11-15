package com.ConditionalStatements;

import java.util.Scanner;

public class vowelConsonantCount {
	static boolean checkString(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }
	static int countVowels(String s) {
		int vowels=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
		}
		return vowels;
	}
	static int countConsonants(String s) {
		int consonants=-0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
					consonants++;
				}
			}
		}
		return consonants;
	}
	static void display(int vowels,int consonants,int totalCount) {
	  totalCount = vowels + consonants;
		System.out.println("Vowels Count :" + vowels);
		System.out.println("Consonants Count :" + consonants);
		System.out.println("Total String Count :" + totalCount);	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine().toLowerCase();
		if(!checkString(s)) {
			System.out.println("Invalid String");
			return;
		}
		 int vowels = countVowels(s);
	        int consonants = countConsonants(s);
	        display(vowels, consonants, consonants);
//		int vowels = 0, consonants = 0, totalCount = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					vowels++;
//				} else {
//					consonants++;
//				}
//			} 
//			else {
//				System.out.println("Invalid String");
//				return;
//			}
//		}
//		int totalCount = vowels + consonants;
//		System.out.println("Vowels Count :" + vowels);
//		System.out.println("Consonants Count :" + consonants);
//		System.out.println("Total String Count :" + totalCount);
		sc.close();
	}

}
