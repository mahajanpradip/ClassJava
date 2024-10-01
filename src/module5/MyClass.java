package module5;

class MyClass1 {
	public void fun1() {
		System.out.println("this is fun1");
	}
}

class MyClass2 {
	public void fun2() {
		System.out.println("This is fun 2");
	}
}

public class MyClass {
	public static void main(String[] args) {
		MyClass1 m = new MyClass1();
		m.fun1();
		MyClass2 m1 = new MyClass2();
		m1.fun2();
		ok ok = new ok();
		ok.okk();
	}
}

class ok {
	public void okk() {
		System.out.println("ok");
	}
}