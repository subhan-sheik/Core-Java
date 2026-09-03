package com.constructors;

public class Employee3 {
	 String employeeName;
	 double salary;
	 boolean doorPower;
	 boolean blocked;
	 Employee3(String employeeName,double salary,boolean doorPower,boolean blocked){
		 this.employeeName=employeeName;
		 this.salary=salary;
		 this.doorPower=doorPower;;
		 this.blocked=blocked;
	 }
	 void checkAccess() {
		boolean access=doorPower && !blocked;
		 System.out.println("Employee Name :"+employeeName);
		 System.out.println("Salary :"+salary);
		 System.out.println("Door Power :"+doorPower);
		 System.out.println("Blocked :"+blocked);
		 System.out.println("Access Status :"+access);
//		String s= (doorPower && !blocked)?"acess granted":"acess denined";
//		System.out.println(s);
	 }

	public static void main(String[] args) {
		Employee3 e=new Employee3("subhan",600000.0,true,false);
		e.checkAccess();
	}

}
