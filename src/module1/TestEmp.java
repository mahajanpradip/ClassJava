package module1;

import module2.Emp;

public class TestEmp {
	public static void main(String[] args) {

		Emp e = new Emp();
		e.accept();
		e.display();
		e.compleProject();
		e.checkAttendance();
		e.applyLoan();
		System.out.println("==============================");
		System.out.println("there is second obj         ||");

		Emp e1 = new Emp();
		e1.accept();
		e1.display();
		e1.compleProject();
		e1.checkAttendance();
		e1.applyLoan();
	}
}
