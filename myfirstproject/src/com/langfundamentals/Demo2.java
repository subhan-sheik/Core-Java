package com.langfundamentals;

public class Demo2 {
	static String hospitalName="MediCover";
	static int totalPatients;
	int patientId;
	String patientName;
	double consultationFee;
	double medicineFee;
	double roomFee;
	void calculateBill() {
		double bill=consultationFee+medicineFee+roomFee;
		System.out.println("Bill :"+bill);
	}
	void patientDetails() {
		System.out.println("Hospital Name :"+hospitalName);
		System.out.println("Patient ID :"+patientId);
		System.out.println("Consultation Fee :"+consultationFee);
		System.out.println("Medicine Fee :"+medicineFee);
		System.out.println("Room Fee :"+roomFee);
		calculateBill();
		System.out.println("-----------------------------------");
	}
	Demo2() {
		totalPatients++;
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		d.patientId=101;
		d.patientName="subhan";
		d.consultationFee=500;
		d.medicineFee=1500;
		d.roomFee=1200;
		d.patientDetails();
		d1.patientId=102;
		d1.patientName="sai pavan";
		d1.consultationFee=500;
		d1.medicineFee=1800;
		d1.roomFee=1200;
		d1.patientDetails();
		d2.patientId=103;
		d2.patientName="bobby";
		d2.consultationFee=500;
		d2.medicineFee=1300;
		d2.roomFee=1200;
		d2.patientDetails();
		System.out.println("Total Patients :"+totalPatients);
	}

}
