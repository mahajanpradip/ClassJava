package module2;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private double score;
	Scanner scc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter roll no");
		rollNo = scc.nextInt();
		System.out.println("Enter name ");
		name = scc.next();
		System.out.println("Enter score");
		score = scc.nextDouble();
	}

	public void attentClass() {
		System.out.println("Attending class");
	}

	public void apperExam() {
		System.out.println("Appering Exam");
	}

	public void completeAssignment() {
		System.out.println("Completing assignment =>> ");
	}

	public void display() {
		System.out.println("Roll no = " + rollNo);
		System.out.println("Name of std = " + name);
		System.out.println("Score = " + score);
	}
}
