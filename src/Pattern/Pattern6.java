package Pattern;

public class Pattern6 {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("8");
		}
		for(int j=i;j<=6;j--) {
			System.out.print(" "+"1");
		}
		System.out.println("");
	}
}
}
