package com.patterns;

public class TestDemo2 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		Another Type
//		int a=5;
//		for(int i=1;i<=a;i++) {
//			for(int j=1;j<=a;j++) {
//				if(i>=2&&i<=4&&j>=2&&j<=4) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
	}

}
