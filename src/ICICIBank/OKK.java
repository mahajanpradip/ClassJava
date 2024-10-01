package ICICIBank;

import java.util.Scanner;

public class OKK {
	public static void main(String[] args) {
		int ch;
		String i;
		Scanner sc = new Scanner(System.in);
		do {
			System.err.println("<<<!>>>ICICI Bank<<<1>>>");
			System.out.println("==========================");
			System.out.println("1 . Accept Details");
			System.out.println("2 . Display Details");
			System.out.println("3 . withdraw Amount");
			System.out.println("4 . Deposite Amount");
			System.out.println("5 . Transfer Amount");
			System.out.println("6 . Check Balance");
			System.out.println("7 . Update Details");
			System.out.println("8 . Exit");
			System.out.println("==========================");
			System.err.println("<<==>>Enter your choice....!!!");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Accept Details");
				break;
			case 2:
              System.err.println("Plese wait for few time......!!!!");
				try {
					Thread.sleep(5000);
					System.out.println("Display Details");
					
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 3:
				System.out.println("Withdraw Details");
				break;
			case 4:
				System.out.println("Deposite Details");
				break;
			case 5:
				System.out.println("Transfer Details");
				break;
			case 6:
				System.out.println("Check Details");
				break;
			case 7:
				System.out.println("Update Details");
				break;
			case 8:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue y/n");
			i = sc.next();
//    if(i != "y" ||i != "Y") {
//    	System.err.println("Thankyou.....!!!!");
			// }
		} while (i.equalsIgnoreCase("y"));
		System.out.println("thankkk");
	}
}
