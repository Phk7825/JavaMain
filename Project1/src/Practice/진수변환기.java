package Practice;

import java.util.Scanner;

//16진수 -> 2진수


public class 진수변환기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수를 입력하세요");
		int a = sc.nextInt();
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
