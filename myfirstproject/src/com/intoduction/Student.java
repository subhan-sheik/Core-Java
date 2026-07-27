package com.intoduction;

public class Student {
	static String collegeName;
	int studentID;
	String studentName;
	String studentCourse;
	long studentPhonenumber;

	public static void main(String[] args) {
		collegeName="rk college of engineering";
		Student hari = new Student();
		hari.studentID=301;
		hari.studentName="hari";
		hari.studentPhonenumber=8978123643L;
		System.out.println("College Name         :" +collegeName);
		System.out.println("Student ID           :" + hari.studentID);
		System.out.println("Student Name         :" + hari.studentName);
		System.out.println("Student Phone Number :" + hari.studentPhonenumber);
	}

}
