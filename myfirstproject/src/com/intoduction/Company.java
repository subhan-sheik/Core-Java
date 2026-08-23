package com.intoduction;

public class Company {
	static String companyName="Deliote";
	String empName;
	int empId;
	double monthlySalary;
	double monthlyGst;
	double monthlyPf;
	double netMonthlySalary;
	int annualGst;
	int annualPf;
	int annualNetSalary;

	void calculateMonthlyPf() {
		monthlyPf=monthlySalary*2/100;
		System.out.println("Monthly PF :"+monthlyPf);
	}
	void calculateMonthlyGst() {
		monthlyGst=monthlySalary*3/100;
		System.out.println("Monthly GST :"+monthlyGst);
	}
	void calculateNetMonthSalary() {
		netMonthlySalary=monthlySalary-monthlyPf-monthlyGst;
		System.out.println("Net Monthly Salary :"+netMonthlySalary);
	}
	void calculateAnnualGst() {
		annualGst=(int) (monthlyGst*12);
		System.out.println("Annual GST :"+annualGst);
	}
	void calculateAnnualPf() {
		annualPf=(int) (monthlyPf*12);
		System.out.println("Annual PF :"+annualPf);
	}
	void calculateAnnualNetSalary() {
		annualNetSalary=(int)(netMonthlySalary*12);
		System.out.println("Annual Net Salary :"+annualNetSalary);

	}
	void displayEmployeeDetails() {
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee ID :"+empId);
		System.out.println("Monthly Salary :"+monthlySalary);
		calculateMonthlyPf();
		calculateMonthlyGst();
		calculateNetMonthSalary();
		calculateAnnualPf();
		calculateAnnualGst();
		calculateAnnualNetSalary();
	}
	static void companyName() {
		System.out.println("Company Name :"+companyName);
	}
	

	public static void main(String[] args) {
		companyName();
		Company c = new Company();
		c.empName="Sheik Subhan";
		c.empId=26201;
		c.monthlySalary=20000;
		c.displayEmployeeDetails();
}

}
