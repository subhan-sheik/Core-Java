package com.operators;

import java.util.Scanner;
//arithmetic Operator are +(addtion(sum)) , -(subtraction(difference)) , *(multiplication(product)) , /(quotient) , %(remainder).

public class ArithmeticOperator {
//	int display(int a, int b) {
//		return a + b;
//	}

	public static void main(String[] args) {
//		ArithmeticOperator a1 = new ArithmeticOperator();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your number :");
//		int result = sc.nextInt();
//		System.out.println("Enetr your number :");
//		int result1 = sc.nextInt();
//		int sum = a1.display(result, result1);
//		System.out.println("sum of two numbers :" + sum);
		int a = 20;
		int b = 30;
		System.out.println("Addition :" + (a + b));
		System.out.println("Addition :" + a + b); // 2030 because string with concatenation so don't add values

//		 The operator - is undefined for the argument type(s) String, int
//		 System.out.println("Subtraction :"+b-a); //this is error because +b consider as string but -a does not consider
		System.out.println("Subtraction :" + (a - b));
		System.out.println("Multiplication :" + a * b); // we don't mention parentheses because BODMAS rule * is greater
														// than + and -
		int x = 31;
		int y = 3;
		System.out.println("Division :" + x / y);
		double d = 10;
		int e = 0;
		System.out.println("Division :" + d / e); // output is infinity but int c=10 and int d=0 this is an
													// arithematicException.
		double z = 0;
		int z1 = 0;
		System.out.println("Division :" + z / z1); // output is NaN means Not a Number but int z=0 and int z1=0 this is
													// an arithematicException.
		System.out.println("Modulas :" + x % y);
		System.out.println("-----------------------------------------------");

		// Arithmetic Operators and char:
		char c = 'A';
		System.out.println("Char value is :" + (c + 1)); // output is 66 because char A is 65 unicode value so 65+1=66
		char c1 = 'B';
		System.out.println("Char values is :" + (c + c1)); // output is 131 because char A is 65 and char B is 66 so
															// 65+66=131.
		System.out.println("-----------------------------------------");

//		  Negative Numbers with %:
		System.out.println("Modulas negative on left operand :" + (-x % y)); // this output is -1 because In Java, the
																				// remainder has the sign of the
																				// dividend (the left-hand operand).
		System.out.println("Modulas negative on right operand :" + (x % -y)); // this output is 1 because right operand
																				// does not dividend so you insert
																				// minus(-) it takes plus(+).

	}

}