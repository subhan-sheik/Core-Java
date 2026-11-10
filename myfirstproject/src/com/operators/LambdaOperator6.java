package com.operators;
//the lambda operator (->)

public class LambdaOperator6 {
	@FunctionalInterface
	interface Factorial{
		int checkFactoral(int n);
	}

	public static void main(String[] args) {
		Factorial f=n->{
			int fact=1;
			for(int i=1;i<=n;i++) {
					fact=fact*i;
			}
			return fact;
		};
		int result=f.checkFactoral(5);
		System.out.println(result);
		
	}

}
