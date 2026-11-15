package com.patterns;

public class ButterFlyPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int a = 1; a <= 2 * (6 - i); a++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int a = 1; a <= 2 * (6 - i); a++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

//        Another Type
//		int n = 6;
//		for (int i = 1; i <= 2 * n; i++) {
//			int stars = (i <= n) ? i : 2 * n - i;
//			int spaces = 2 * (n - stars);
//			for (int j = 1; j <= stars; j++) {
//				System.out.print("*");
//			}
//			for (int a = 1; a <= spaces; a++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= stars; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
