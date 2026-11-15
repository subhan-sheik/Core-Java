package com.ConditionalStatements;

public class ForLoopConditions {

	public static void main(String[] args) {
//		AND(&&)
		for (int i = 1, j = 10; i <= 5 && j >= 4; i++, j -= 2) { // i checks i=1 and i<=5 is true or not so 1<=5 is true
			System.out.println(i + " " + j); // j checks j=10 and j>=4 is true or not so 10>=4 is true
												// so both(i<=5 and j>=4) conditions true so we execute you have satisfy
												// one condition iteration was stop
		}
		System.out.println("********************************");
//		OR(||)
		for (int i = 1, j = 10; i <= 5 || j >= 8; i++, j -= 2) {
			System.out.println(i + " " + j);
		}

	}

}
