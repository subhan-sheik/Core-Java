package com.patterns;

public class TestDemo11 {

	public static void main(String[] args) {
		int stars=9,spaces=0;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			if(i<5) {
				stars -=2;
				spaces +=1;
			}
			else {
				stars +=2;
				spaces -=1;
			}
			System.out.println();
		}
	}

}
