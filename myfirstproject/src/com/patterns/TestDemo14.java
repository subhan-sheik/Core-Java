package com.patterns;

public class TestDemo14 {

	public static void main(String[] args) {
		int stars=1,spaces=4,ash=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=ash;l++) {
				System.out.print("#");
			}
				stars++;
				ash++;
				spaces--;
			System.out.println();
		}
	}

}
