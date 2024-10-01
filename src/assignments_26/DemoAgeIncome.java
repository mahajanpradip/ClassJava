package assignments_26;

import java.util.Scanner;

public class DemoAgeIncome {

	public static void main(String[] args) {
		int age;
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		age = sc.nextInt();
		System.out.println("Enter salarsy ");
		salary = sc.nextDouble();
		if ((age >= 18 && age <= 60) && (salary >= 25000)) {
			System.out.println("Persion is eligable for the loan");
		} else {
			System.out.println("not eligable for loain");
		}
	}

}
