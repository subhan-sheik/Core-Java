package com.langfundamentals;

import java.util.Scanner;

public class Demo6 {
	static Scanner sc = new Scanner(System.in);
	String clgName;
	String stName;
	int stId;
	String courseName;
	int english;
	int telugu;
	int hindi;
	int social;
	int totalMarks;
	double averageMarks;

	void displayStudentsDetails() {
		System.out.println("Enter your College Name :");
		sc.nextLine();
		clgName = sc.nextLine();
		System.out.println("Enter Student Name :");
		stName = sc.nextLine();
		System.out.println("Enter Student ID :");
		stId = sc.nextInt();
		System.out.println("Eneter your Course :");
		sc.nextLine();
		courseName = sc.nextLine();
		System.out.println("Enter your English Marks :");
		english = sc.nextInt();
		System.out.println("Enter your Telugu Marks :");
		telugu = sc.nextInt();
		System.out.println("Enter your Hindi Marks :");
		hindi = sc.nextInt();
		System.out.println("Enter your Social Marks :");
		social = sc.nextInt();
		System.out.println("---------------------------");
		System.out.println("College Name :" + clgName);
		System.out.println("Student Name :" + stName);
		System.out.println("Student ID :" + stId);
		System.out.println("Student course :" + courseName);
		System.out.println("---------------------------");

	}

	void calculateTotalMarks() {
		totalMarks = english + telugu + hindi + social;
		averageMarks = totalMarks / 4.0;
		System.out.println("Total Marks :" + totalMarks);
		System.out.println("Average Marks :" + averageMarks);

	}

	public static void main(String[] args) {
		Demo6 d = new Demo6();
		Demo6 d1 = new Demo6();
		d.displayStudentsDetails();
		d.calculateTotalMarks();
		d1.displayStudentsDetails();
		d1.calculateTotalMarks();
		if (d.totalMarks > d1.totalMarks) {
			System.out.println("Student 1 scored higher");
		} else if (d1.totalMarks > d.totalMarks) {
			System.out.println("student 2 scored higher");
		} else {
			System.out.println("Both students are equal");
		}
		sc.close();

	}

}
