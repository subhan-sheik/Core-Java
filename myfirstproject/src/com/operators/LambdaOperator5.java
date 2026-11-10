package com.operators;
//Use a lambda expression to check whether a number is prime.
//Test with:
//29
//Expected:
//true

public class LambdaOperator5 {
	@FunctionalInterface
	interface PrimeCheck {
		boolean isPrime(int n);
	}

	public static void main(String[] args) {
		PrimeCheck p = n -> {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				} 
			}
			return count == 2;
		};
		boolean result = p.isPrime(29);
		System.out.println(result);
	}

}
