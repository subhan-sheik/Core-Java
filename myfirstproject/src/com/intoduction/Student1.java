package com.intoduction;

public class Student1 {
	static String collegeName="JNTUK";
	int studentId;
	int totalMarks;
	String studentName;
	int teluguMarks;
	int englishMarks;
	int hindiMarks;
	int socialMarks;
	float percentage;
	void calculateTotal() {
		totalMarks=teluguMarks+englishMarks+hindiMarks+socialMarks;
	}
	void calculatePercentage() {
		percentage=totalMarks/4.0f;
	}
	void displayStudent() {
		System.out.println("Student Id :"+studentName);
		System.out.println("Student name :"+studentName);
		System.out.println("Telegu Marks :"+teluguMarks);
		System.out.println("English Marks :"+englishMarks);
		System.out.println("Hindi Marks :"+hindiMarks);
		System.out.println("Social Marks :"+socialMarks);
		System.out.println("Total Marks :"+totalMarks);
		System.out.println("Percentage :"+percentage);
	}

	public static void main(String[] args) {
		System.out.println("College Name :"+collegeName);
		Student1 s = new Student1();
		s.studentId=101;
		s.studentName="subhan";
		s.teluguMarks=96;
		s.englishMarks=97;
		s.hindiMarks=94;
		s.socialMarks=93;
		s.calculateTotal();
		s.calculatePercentage();
		s.displayStudent();
		System.out.println("**************************************");
		Student1 s1 =new Student1();
		s1.studentId=102;
		s1.studentName="pavan";
		s1.teluguMarks=96;
		s1.englishMarks=89;
		s1.hindiMarks=91;
		s1.socialMarks=97;
		s1.calculateTotal();
		s1.calculatePercentage();
		s1.displayStudent();
		
	}

}
