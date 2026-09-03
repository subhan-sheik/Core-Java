package com.operators;

public class RelationalOperator {

	public static void main(String[] args) {
		int salary1 = 30000;
		int salary2 = 40000;

		System.out.println(salary1 > salary2);
		System.out.println(salary1 < salary2);
		System.out.println(salary1 == salary2);
		System.out.println(salary1 != salary2);
		System.out.println("-------------------------------");
		   int a = 20;
	        int b = 10;

	        System.out.println("a > b  : " + (a > b));
	        System.out.println("a < b  : " + (a < b));
	        System.out.println("a >= b : " + (a >= b));
	        System.out.println("a <= b : " + (a <= b));
	        System.out.println("a == b : " + (a == b));
	        System.out.println("a != b : " + (a != b));
	        System.out.println("-------------------------------");
	        
//	        Comparing Characters
		char a1 = 'A'; 
		char b1 = 'B';
		System.out.println(a1 < b1);
		System.out.println("-------------------------------");
		char ch = 'A';
		System.out.println(ch == 'A');
		System.out.println(ch != 'B');
		System.out.println("-------------------------------");
		
//		Comparing Floating-Point Values
		double c = 0.1 + 0.2;
		System.out.println(c == 0.3);
		System.out.println("-------------------------------");
		
//		Relational Operators with Negative Numbers
		int d = -10;
		int e = -20;
		System.out.println(d > e);
		System.out.println("-------------------------------");
			
//		String s1 = new String("Java");  
//		String s2 = new String("Java");
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("-------------------------------");
		
//		What if one is a literal and one uses new
		String s3 = "Java";
		String s4 = new String("Java");

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println("--------------------------------");
		
//		What about String variables
		String s5 = "Java";
		String s6 = s1;
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println("---------------------------------");
		
	}

}
