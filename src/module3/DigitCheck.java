package module3;
import java.util.Scanner;
public class DigitCheck {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int digit;
System.out.println("Enter digit for check");
digit=sc.nextInt();
if(digit>0 && digit<10) {
	System.out.println("one digit number");
}else if(digit>11 && digit<100) {
	System.out.println("two digit number");
}else if(digit>99 && digit<1000) {
	System.out.println("three digit number");
}else if(digit>999 && digit<10000) {
	System.out.println("four digit number");
}else {
	System.out.println("greator then four digit");
}
}
}
