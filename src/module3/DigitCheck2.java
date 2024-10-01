package module3;

import java.util.Scanner;

public class DigitCheck2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int digit,rem=0,count=0,sum=0,a=0;
	System.out.println("Enter digit");
	digit=sc.nextInt();
//	for(int i=0;digit>0;i++) {
//		rem=digit%10;
//		digit=digit/10;
//		count++;
//	}
	while(digit>0) {
		rem=digit%10;
		
		digit=digit/10;
	}
	count=digit/10;
	System.out.println(rem);
	System.out.println(count);
//	ok=digit%10;
//	for(int i=1;i<=count;i++) {
//		sum=sum*rem;
//	}
	//System.out.println(rem);
//	System.out.println(count);
//	System.out.println(sum);
//	System.out.println(ok);
}
}
