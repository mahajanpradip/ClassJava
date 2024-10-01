package assignments_26;
//Assignment 3: Door Access Control
//Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.
import java.util.Scanner;
public class DoorAccessControl {
private int id;
private boolean card;
private boolean admin;
Scanner sc=new Scanner(System.in);
public void accept() {
	System.out.println("Enter id ");
	id=sc.nextInt();
	System.out.println("Enter card");
	card=sc.nextBoolean();
	System.out.println("Enter you are admin or not");
	admin=sc.nextBoolean();
}
public void display() {
	System.out.println("id =>> "+id);
	System.out.println("card =>> "+card);
	System.out.println("admin =>> "+admin);
}
public void check() {
	if((id>=0 && id<=9 && card==true)||(admin==true)) {
		System.out.println("Access on");
	}else {
		System.out.println("Access denied");
	}
}
}
