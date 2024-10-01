package module6;

public class CompareString {
public static void main(String[] args) {
	int a=100;
	int b=100;
	if(a==b)
		System.out.println("same");
	else
		System.out.println("not same ");
	String str1="Pradip";
	String str2="Pradip";
	if(str1==str2)
		System.out.println("same");
	else
		System.out.println("not same");
	String str3=new String("Ok");
	String str4=new String("OK");
	if(str3.equals(str4))
		System.out.println("same");
	else
		System.out.println("not same");
	try {
		String str5="Mahajan";
		String str6="mahajan";
		if(str5.equalsIgnoreCase(str6))
			System.out.println("equal...!!!");
		else
		    System.out.println("not equals ...!!");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
