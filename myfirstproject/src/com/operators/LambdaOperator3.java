package com.operators;
//Add a and b
//Print the sum
//Check whether the sum is Even or Odd

public class LambdaOperator3 {
	@FunctionalInterface
	interface Calculator {
		void calculate(int a,int b);
	}

	public static void main(String[] args) {
		Calculator c=(a,b)->{
			int sum=a+b;
			System.out.println("Sum = "+sum);
			if(sum%2==0) {
				System.out.println("Even Number");
			}else {
				System.out.println("Odd Number");
			}
		};
		c.calculate(15, 25);
	}

}
