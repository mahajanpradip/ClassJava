package module5;
import java.util.Scanner;
public class Circle {
private int radius;
private double area;
private double peri;
final double PI=3.14;
Scanner sc=new Scanner(System.in);
public void accept() {
 System.out.println("Enter radius =>> ");
 radius=sc.nextInt();
 
}
public void display() {
	System.out.println("Enter radius =>> "+radius);
	System.out.println("the area is =>> "+area);
	 System.out.println("the perimeter is  =>> "+peri);
}
public void calArea() {
	area=PI*radius*radius;
}
public void calPeri() {
	peri=2*PI*radius;
}
}
