package module2;

//import java.util.Scanner;
public class testClass {
	public static void main(String[] args) {
//	  Scanner sc=new Scanner(System.in);
//	  int i=sc.nextInt();
//	  String s=sc.next();
//	  double d=sc.nextDouble();
		Student Student = new Student();
		System.out.println("this is first obj");
	//	Student.accept();
		Student.display();
		Student.apperExam();
		Student.attentClass();
		Student.completeAssignment();

		System.out.println("=========================================");

		Student Student2 = new Student();
		System.out.println("This is secont obj");
		Student.accept();
		Student2.display();
		Student2.apperExam();
		Student2.attentClass();
		Student2.completeAssignment();
	}
}
