package com.patterns;

public class PascalTriangle {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
					System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+num);
				if(k<i) {
				num =num*(i-k)/k;
				}
			}
			System.out.println();
		}
	}

}
