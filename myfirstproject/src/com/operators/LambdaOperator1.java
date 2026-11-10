package com.operators;
//@FunctionalInterface = “Keep exactly ONE abstract method.”
//It doesn't create the lambda.
//It doesn't execute anything.
//It simply tells Java to check that the interface qualifies as a functional interface.

//@FunctionalInterface
//interface Calculator {
//    int add(int a, int b);
//}
public class LambdaOperator1 {
	@FunctionalInterface
	// sum of two numbers
//	interface Calculator {
//	    int add(int a, int b);
//	}
	//squares......
	interface Square{
		int num(int a);
	}
	public static void main(String[] args) {
		//sum of two numbers....
//		 Calculator c = (a, b) -> a + b;
//	        System.out.println(c.add(10, 20));
		//squares....
		Square s=a->a*a;
		System.out.println(s.num(5));
	        
	}

}
