package Practice;

import java.util.Scanner;

public class 메모장 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String A = sc.next();
	int a = Integer.parseInt(A,16);
	System.out.println("10진수 값:" +a);
	int b = 0;
	int c = 0;
	for(int i = 1; i>0;i*=10) {
		c = a%2;
		b = i*c + b;
		if(a > 1) {
		a = a/2;
		}else if(a == 1) {
			break;
		}
	}
	System.out.println("2진수 값:" +b);
	}
}
