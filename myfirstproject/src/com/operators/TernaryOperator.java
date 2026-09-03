package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 250;
//		int num=0;
//		String max=(a>b)?((a>c)?a+" A is greater":b+" B is greater"):((b>c)?b+" B is greater":c+" C is greater");
		String max = (a > b) && (a > c) ? a + "A is greater" : ((b > c) ? b + "B is greater" : c + "C is greater");
		System.out.println(max);
//		if(num%2==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
//		 String num1=(num%2==0)?"Even":"odd";
//		 System.out.println(num1);
		System.out.println((a & 1) == 0 ? "even" : "odd");
		int stMarks = 67;
		String result = (stMarks >= 91) ? stMarks + "S Grade"
				: (stMarks >= 81) ? stMarks + "A Grade"
						: (stMarks >= 71) ? stMarks + "B Grade"
								: (stMarks >= 51) ? stMarks + "C Grade"
										: (stMarks > 41) ? stMarks + "D Grade"
												: (stMarks >= 35) ? stMarks + "E Grade" : stMarks + "Fail";
		System.out.println(result);
		
		int x = 19;
		if (x % 3 == 0 && x % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (x % 3 == 0) {
			System.out.println("Fizz");
		} else if (x % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.err.println("Given Number is Not Divisible by 3 and 5");
		}
	}

}
