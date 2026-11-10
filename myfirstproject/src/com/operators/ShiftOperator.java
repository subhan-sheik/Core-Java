package com.operators;
//the shift operators are left shift(<<),right shift(>>) and unsigned(>>>).

public class ShiftOperator {

	public static void main(String[] args) {
//		left shift(<<) operator
		int a = 10;
		System.out.println("**************Left Shift**************");
		System.out.println(a << 1); // a*2 power 1 means 10*2 power 1=10*2=20
		System.out.println(a << 2); // a*2 power 2 means 10*2 power 2=10*4=40
		System.out.println(a << 3); // a*2 power 3 means 10*2 power 3=10*8=80

//		right shift(>>) operator
		int b = 30;
		System.out.println("**************Right Shift**************");
		System.out.println(b >> 1); // output:15 30 half or 30=
		System.out.println(b >> 2); // output:7 15 lo half
		System.out.println(b >> 3); // output:3 7 lo half
//		right shift positive and negative are produce different values but same number
		int c = -30;
		System.out.println(c >> 1); // output:-15 30 lo half
		System.out.println(c >> 2); // output:-8 15 lo half the negative sign add 1 for positive number
		System.out.println(c >> 3); // output:-4 7 lo half

		int x = 30;
		System.out.println("**************UnSigned**************");
		System.out.println(x >>> 1); // same as right shift only for positive number.
//		the unsigned operator is does not change value for positive numbers.But only change value for negative number.
		int y = -30;
		System.out.println(y >>> 1);

	}

}
