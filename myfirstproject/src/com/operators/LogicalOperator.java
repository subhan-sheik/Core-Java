package com.operators;
//the logical operators are &&,|| and !

public class LogicalOperator {

	public static void main(String[] args) {
		int age = 25;
		int marks = 80;
		boolean attendance = true;

		if (age >= 18 && marks >= 40 && attendance) { // && every condition must be true if one false answer is false
			System.out.println("Eligible");
		}
		int day = 6;

		if (day == 6 || day == 7 || day == 0) { // || if one condition is true the answer is true.
			System.out.println("Weekend");
		}
		boolean a = false;
		boolean b = false;
		boolean c = true;

		System.out.println(a || b && c); // this conditions happens && conditions because && is higher precedence than
											// || so we calculate && condition after that we go to || condition. so
											// output is true.suppose we calculate || first we use parenthesis
											// ex:(a||b) &&c
		System.out.println(!c); //the actual answeer is true but output is false because we use logical Not (!) so answer is reverse.
//		if true answer is false or if false answer is true.
	}

}
