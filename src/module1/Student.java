package module1;

public class Student {
private int rollNo;
private String name;
private double score;

public void attendClass() {
	System.out.println("Attending Class =>> ");
}
public void apperExam() {
	System.out.println("Apparing Exam =>> ");
}
public void completeAssignment() {
	System.out.println("Completeing Assignment =>> ");
}
public void Display() {
	System.out.println("RollNo is => "+rollNo);
	System.out.println("Name is =>> "+name);
	System.out.println("Score is =>> "+score);
}


public static void main(String[] args) {
	Student student=new Student();
	student.rollNo=1;
	student.name="Pradip";
	student.score=99.99;
	student.Display();
	student.attendClass();
	student.apperExam();
	student.completeAssignment();
	System.out.println("=====================================");
	Student student1=new Student();
	student1.rollNo=2;
	student1.name="Pratik";
	student1.score=99.99;
	student1.Display();
	student1.attendClass();
	student1.apperExam();
	student1.completeAssignment();
	System.out.println("=====================================");
	Student student2=new Student();
	student2.rollNo=3;
	student2.name="Neelesh";
	student2.score=99.99;
	student2.Display();
	student2.attendClass();
	student2.apperExam();
	student2.completeAssignment();
	System.out.println("=====================================");
}
}
