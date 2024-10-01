package module4;

import java.util.Scanner;

public class Emp {
	 private int empNo;
	 private String ename;
	 private int bal;
	 Scanner sc=new Scanner(System.in);
	 public void accept() {
		 System.out.println("Enter name age and salary !!");
		 empNo=sc.nextInt();
		 ename=sc.next();
		 bal=sc.nextInt();
	 }
	 public void checkEmpNo() {
		 if(empNo>=0) {
			 System.out.println("valid no");
		 }else {
			 System.out.println("envalid no");
		 }
	 }
	 public void checkBal() {
		 if(bal>=0 && bal <=100000) {
			 System.out.println("valid age eliglible for vote "+bal);
		 }else {
			 System.out.println("Invalid age"+bal);
		 }
	 }

	 public void display() {
		 System.out.println("name is =>> "+empNo);
		 System.out.println("age is =>> "+ename);
		 System.out.println("salary =>> "+bal);
	 }
	}

