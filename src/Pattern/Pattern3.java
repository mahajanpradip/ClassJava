package Pattern;

public class Pattern3 {
public static void main(String[] args) {

	
	//my name starts here
	for(int i=1;i<=7;i++) {
		System.out.println(" ");
	}
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1||j==1||i==5||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==1||j==1||i==5||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==1||j==1||i==5||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==1||j==3||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==1||j==3) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==1||j==1||i==5||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println("");
	}
	
	
	
	

	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(j==1) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=i;j++) {
			if(j==1) {
			System.out.print("#");
		}else {
			System.out.print(" ");
		}
		}
		for(int j=1;j<=5;j++) {
			if(j==1) {
				System.out.print("#");
			}
		}
		for(int j=1;j<=5-i-1;j++) {
			
				System.out.print(" ");
			
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==5) {
			System.out.print("#");
		}else {
			System.out.print(" ");
		}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==5||j==3||j==5) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(i==5||j==3) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1||j==2) {
				System.out.print(" ");
			}
		}
		for(int j=1;j<=5;j++) {
			if(j==1) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}
}

