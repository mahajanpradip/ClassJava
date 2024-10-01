package module2;

import java.util.Scanner;

public class Emp {
	private int empNo;
	private String eName;
	private double empSalary;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Employee no =         ||");
		System.out.println("==============================");
		empNo = sc.nextInt();
		System.out.println("Enter Employee name =       ||");
		eName = sc.next();
		System.out.println("Enter Employee salary =     ||");
		empSalary = sc.nextDouble();
	}

	public void display() {
		System.out.println("==============================");
		System.out.println("Emplouee id =>>" + empNo + "||");
		System.out.println("Employee name=>" + eName + "||");
		System.out.println("salary=>>" + empSalary + "  ||");
		System.out.println("==============================");
	}

	public void compleProject() {
		System.out.println("project is complected!!!!");
	}

	public void checkAttendance() {
		System.out.println("Attendancve is...!!!!");
	}

	public void applyLoan() {
		System.out.println("Apply for loan .....!!!!");
	}
}
