package module5;

public class OverloadMain {
	public static void main() {
		System.out.println("withount paremeter ..!!");
	}

	public static void main(int a) {
		try {
			System.err.println(a);
			Thread.sleep(5000);
		System.err.println(a);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	 
	public static void main(int a, int b) {
		try {
			Thread.sleep(5000);
		System.err.println(a + b);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//	 System.out.println(main(10));
//	}

	public static void main(String[] args) {
         OverloadMain O=new OverloadMain();
         O.main();
         O.main(10);
         O.main(10,80);
         OverloadMain O1=new OverloadMain();
         O1.main();
         System.err.println("This is hashcode =>> "+O.hashCode());
         System.err.println(O.equals("t"));
         System.err.println(O.equals("t1"));
         System.err.println(O.equals(O));
         System.err.println(O.equals(O1));
         Testing t=new Testing();
         t.Odd(10, 20);
         Testing2 t1=new Testing2();
         t1.Even(2, 4);
         int resultt=t1.Odd(20,340, 78);
         System.err.println(resultt);
	}
}
