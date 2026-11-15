package com.patterns;

public class PrintKohli {

	public static void main(String[] args) {
		String s="kohli";
		char ch='a';
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i+j==4) {
					System.out.print(s.charAt(i)+" ");
				}else {
					System.out.print(ch+++" ");
				}
			}
			System.out.println();
		}
	}

}
