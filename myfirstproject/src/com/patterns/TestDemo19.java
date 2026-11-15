package com.patterns;

public class TestDemo19 {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int stars=5;
//		for(int i=1;i<=stars;i++) {
//			for(int j=1;j<=stars;j++) {
//				if(i==1||i==stars||j==stars||j==1) {
//					System.out.print("*");
//				}else {
//				System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		int stars=5;
		for(int i=1;i<=stars;i++) {
			for(int j=1;j<=stars;j++) {
				if(j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=stars;i++) {
			for(int j=stars;j>=i;j--) {
				if(i==j) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j||i+j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
