package module5;

public class OverloadingDemo {
static int add(int a,int b) {
	return(a+b);
}
static int add(int a,int b,int c) {
	return(a+b+c);
}
static double add(int b,double c) {
	return(b+c);
}

public static void main(String[] args) {
	int result=add(12,12);
	System.out.println(result);
	int result1=add(12,12,12);
	System.out.println(result1);
	double result2=add(12,12.687);
	System.out.println(result2);
	System.out.println(OverloadingDemo.add(10,20));
}
}
