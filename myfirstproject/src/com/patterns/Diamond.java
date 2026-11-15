package com.patterns;

public class Diamond {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		Another Type
		
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
				stars +=2;
				spaces -=1;
			}
			else {
				stars -=2;
				spaces +=1;
			}
			System.out.println();
		}
		
	}

}
