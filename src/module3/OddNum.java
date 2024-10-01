package module3;

public class OddNum {
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		while (a <= 20) {
			if (a % 2 != 0) {
				System.out.println(a);
			}
			a++;
		}

	}
}
