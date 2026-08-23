package com.intoduction;
import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
//		int totalMarks=500;
//		int studentScored=425;
//		float percentage=(studentScored*100.0f)/totalMarks;
//		System.out.println("total marks :"+totalMarks);
//		System.out.println("studentScored :"+studentScored);
//		System.out.println("percentage :"+percentage+"%");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String a=sc.next();
		System.out.print("Enter Telugu Marks :");
		int b= sc.nextInt();
		System.out.print("Enter English Marks :");
		int c=sc.nextInt();
		System.out.print("Enter Hindi Marks :");
		int d=sc.nextInt();
		int totalMarks=b+c+d;
		double averageMarks=totalMarks/3.0;
		System.out.println("-----------------------------");
		System.out.println("Name :"+a);
		System.out.println("Total Marks :"+totalMarks);
		System.out.println("Average Marks :"+averageMarks);

		sc.close();
	}

}
