package module3;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		switch(num) {
		case 5 :
			System.out.println("movie time");
			break;
		case 6 :
			System.out.println("super saterday");
			break;
		case 7 :
			System.out.println("sleepy sunday ");
		  break;
		default :
			System.out.println("work day");
		}
	}

}
