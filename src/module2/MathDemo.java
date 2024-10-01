package module2;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(144));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(20, 50));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.abs(-26));
		System.out.println(Math.random());
		double d = (int) (Math.random() * 1000);
		System.out.println(d);
		System.out.println(Math.ceil(124.6));
		System.out.println(Math.floor(288.44));
		System.out.println(Math.round(124.6));
		System.out.println(Math.decrementExact(15));
		System.out.println(Math.ulp(90));
		System.out.println(Math.toRadians(78));
		System.out.println(Math.toDegrees(67));
	}
}
