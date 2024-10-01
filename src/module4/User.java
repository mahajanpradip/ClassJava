package module4;
import java.util.Scanner;
public class User {
 private String name;
 private int age;
 private int salary;
 Scanner sc=new Scanner(System.in);
 public void Set() {
	 System.out.println("Enter name age and salary !!");
	 name=sc.next();
	 age=sc.nextInt();
	 salary=sc.nextInt();
 }
 public void checkAge() {
	 if(age>=18 && age <=100) {
		 System.out.println("valid age eliglible for vote "+age);
	 }else if(age>0 && age<18){
		 System.out.println("Not eligible for vote "+age);
	 }else {
		 System.out.println("Envalid age"+age);
	 }
 }
 public void checkSalary() {
	 if(salary>10000 && salary<100000) {
		 System.out.println("valid salary");
	 }else {
		 System.out.println("envalid salary");
	 }
 }
 public void display() {
	 System.out.println("name is =>> "+name);
	 System.out.println("age is =>> "+age);
	 System.out.println("salary =>> "+salary);
 }
}
