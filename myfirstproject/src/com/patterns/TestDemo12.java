package com.patterns;

public class TestDemo12 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
		for(int k=n;k>i;k--) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		int stars=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			if(i<5) {
				stars ++;
			}else {
				stars --;
			}
			System.out.println();
		}
	}

}
