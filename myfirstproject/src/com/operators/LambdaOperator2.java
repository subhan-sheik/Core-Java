package com.operators;
//1.program zero parameters...

//interface Greetings{
// void greet();
//	
//}

//2.program check condition given number greater than 10 or not

public class LambdaOperator2 {
	@FunctionalInterface
	interface Condition {
		boolean check(int n);
	}

	public static void main(String[] args) {
//		Greetings g=()->System.out.println("Hello Java");
//		g.greet();

		Condition c = n -> n > 10;
		boolean result = c.check(25);
		System.out.println(result);

	}

}
