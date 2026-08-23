package com.langfundamentals;

public class LoanManagement {
	String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;
	double calculateInterest(double loanAmount,double interestRate) {
		double interest=(loanAmount * interestRate * loanTenure) / 100;
		return interest;
	}
	double calculateTotalAmount(double interest) {
		double totalAmount=loanAmount+interest;
		return totalAmount;
	}
	double calculateMonthlyEMI(double totalAmount,int loanTenure) {
		double monthlyEmi=totalAmount/(loanTenure*12);
		return monthlyEmi;
	}
	void displayLoanSummary(double interest,double totalAmount,double monthlyEmi) {
		System.out.println("--------Loan Summary----------");
		System.out.println("Customer Name :"+customerName);
		System.out.println("Loan Amount :"+loanAmount);
		System.out.println("Interest Rate :"+interestRate);
		System.out.println("Loan Tenure :"+loanTenure);
		System.out.println("Interest :"+interest);
		System.out.println("Total Amount :"+totalAmount);
		System.out.println("Monthly EMI :"+monthlyEmi);
	}


	public static void main(String[] args) {
		LoanManagement lo =new LoanManagement();
		lo.customerName="Subhan";
		lo.loanAmount=50000;
		lo.interestRate=5;
		lo.loanTenure=3;
		double interest1=lo.calculateInterest(lo.loanAmount, lo.interestRate);
		double totalAmount1=lo.calculateTotalAmount(interest1);
		double monthlyEmi1=lo.calculateMonthlyEMI(totalAmount1, lo.loanTenure);
		lo.displayLoanSummary(interest1, totalAmount1, monthlyEmi1);
	}

}
