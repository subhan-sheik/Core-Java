package com.intoduction;

public class Hospital {
	int patientId;
	String patientName;
	String disease;
	double billAmount;
	static String hospitalName="Apollo Hospital";
	void admitPatient() {
		System.out.println("Patent Admit Successfully");
	}
	void generateBill() {
		billAmount+=2000;
		System.out.println("Updated Bill :"+billAmount);
	}
	void displayPatientDetails() {
		System.out.println("Hospital Name :"+hospitalName);
		System.out.println("Patient ID :"+patientId);
		System.out.println("Patient Name :"+patientName);
		System.out.println("Disease :"+disease);
		System.out.println("Bill Amount :"+billAmount);
		System.out.println("----------------------------------------");
	}
	static void changeHospitalName() {
		hospitalName="Yashoda Hospital";
		System.out.println("Hospital Name Changed Successfully");
	}
	static void displayHospitalName() {
		System.out.println("Hospital Name :"+hospitalName);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		displayHospitalName();
		Hospital h = new Hospital();
		Hospital h1 = new Hospital();
		h.patientId=101;
		h.patientName="sai pavan";
		h.disease="Cancer";
		h.billAmount=10000;
		h1.patientId=102;
		h1.patientName="bobby";
		h1.disease="Typhoid";
		h1.billAmount=20000;
		h.displayPatientDetails();
		h1.displayPatientDetails();
		h.admitPatient();
		h1.admitPatient();
		h.generateBill();
		h1.generateBill();
		System.out.println("------------------------------------");
		changeHospitalName();
		h.displayPatientDetails();
		h1.displayPatientDetails();
		
		
	}

}
