package com.langfundamentals;

public class Demo1 {
	Integer studentId;
	String studentName;
	String gender;
	String branchName;
	String clgName;
	void displayStudentDetails() {
		System.out.println("College Name :"+clgName);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student ID :"+studentId);
		System.out.println("Branch Name :"+branchName);
		System.out.println("Gender :"+gender);
	}
	Demo1(String clgName,String studentName,Integer studentId,String branchName,String gender){
		this.studentId=studentId;
		this.studentName=studentName;
		this.gender=gender;
		this.branchName=branchName;
		this.clgName=clgName;
		
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1("Rk college of engineering","subhan sheik",101,"CSE","Male");
		Demo1 d1 = new Demo1("Rk college of engineering","pavan",102,"CSE","Male");
		Demo1 d2 = new Demo1("Rk college of engineering","ravi",103,"ECE","Male");
		d.displayStudentDetails();
		System.out.println("------------------------------------");
		d1.displayStudentDetails();
		System.out.println("------------------------------------");
		d2.displayStudentDetails();
		
	
		
	}

}
