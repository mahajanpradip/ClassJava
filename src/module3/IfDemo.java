package module3;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number for Check");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positive no ==>>> " + num);
		} else if (num < 0) {
			System.out.println("Negative no ==>>> " + num);
		} else {
			System.out.println("Number is Zero");
		}
	}

}