package assignments_26;
//Assignment 2: Exam Grading System

//Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.
import java.util.Scanner;

public class ExamGredingSystem {
	int sub1, sub2, sub3, avg;
	Scanner sc = new Scanner(System.in);

	public void acceptMarks() {
		System.out.println("Enter subject 1 marks");
		sub1 = sc.nextInt();
		System.out.println("Enter subject 2 marks");
		sub2 = sc.nextInt();
		System.out.println("Enter subject 3 marks");
		sub3 = sc.nextInt();
	}

	public int calculateAvg() {
		avg = (sub1 + sub2 + sub3) / 3;
		return avg;
	}

	public void display() {
		System.out.println("Subject 1 marks =>>" + sub1);
		System.out.println("Subject 2 marks =>>" + sub2);
		System.out.println("Subject 3 marks =>>" + sub3);
		System.out.println("Average mark of Student =>>" + avg);

	}
}
