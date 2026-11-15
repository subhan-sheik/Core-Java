package com.patterns;

public class TestDemo13 {

	public static void main(String[] args) {
		int stars=1;
		int spaces=4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			if(i<5) {
				stars ++;
				spaces --;
			}
			else {
				stars --;
				spaces ++;
			}
			System.out.println();
		}
	}

}
