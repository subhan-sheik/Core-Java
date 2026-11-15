package com.patterns;

public class TestDemo16 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		int spaces=4;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		int space=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
