package com.patterns;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		another type of pyramid
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
