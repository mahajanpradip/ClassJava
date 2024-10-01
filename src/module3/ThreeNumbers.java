package module3;
import java.util.Scanner;
public class ThreeNumbers {
public static void main(String[] args) {
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 number");
	num1=sc.nextInt();
	System.out.println("Enter second number");
	num2=sc.nextInt();
	System.out.println("Enter third number");
	num3=sc.nextInt();
	if(num1>num2 && num1>num3) {
		System.out.println("num1 is greator than other numbers =>> "+num1);
	}else if(num2>num1 && num2>num3) {
		System.out.println("num2 is greator then the numbers =>> "+num2);
	}else if(num3>num1 && num3>num2) {
		System.out.println("Num3 is greatore then other two numbers =>> "+num3);
	}else {
		System.out.println("Equal numbers");
	}
}
}
