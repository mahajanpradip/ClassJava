package module3;
import java.util.Scanner;
public class IfDemo2 {
   public static void main(String[] args) {
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers for check");
	num1=sc.nextInt();
	num2=sc.nextInt();
	if(num1>num2) {
		System.out.println("num1 is greator "+num1);
	}else if(num2>num1) {
		System.out.println("num2 is gresator "+num2);
	}else {
		System.out.println("same");
	}
}

}
