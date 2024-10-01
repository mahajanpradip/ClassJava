package module5;

public class UpwardCasting {
public static void main(String[] args) {
	int a=100;
	double d=a;
	
	System.out.println(d);//upward casting
	
	double p=55.55;
	int i=(int)p;
	System.out.println(i);
	
	float w=34.45f;
	short s=(short)w;
	System.out.println(s);
	
	short ss=78;
	float k=ss;
	System.out.println(k);
	
	char x=89;
	int c=x;
	System.out.println(c);
	
	int m=99;
	char l=(char)m;
	System.out.println(l);
}
}
