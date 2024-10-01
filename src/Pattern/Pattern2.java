package Pattern;

public class Pattern2 {
public static void main(String[] args) {
	char a='A';
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=5;j++) {
			System.out.print((char)(a+i+j));
		}
		
		System.out.println("");
	}

int c=1;
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i);
	}
	System.out.println();
}
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	System.out.println();
}

for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i%2);
	}
	System.out.println("");
}
for(int i=1;i<=6;i++) {
	for(int j=6;j>=i;j-- ) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("#");
	}
	System.out.println("");
}

for(int i=1;i<=5;i++) {
	for(int j=6;j>=i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print((j+i-1)+" ");
	}
	for(int j=6;j>=i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(("*")+" ");
	}
	System.out.println("");
}
for(int i=1;i<=5;i++) {
	for(int j=6;j>=i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(("*")+" ");
	}
	System.out.println("");
}
int s=6;
for(int i=1;i<=6;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print(s-i);
	}
	System.out.println("");
}

}
}
