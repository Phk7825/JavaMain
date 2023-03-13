package day5;

import java.util.Scanner;

// 계산기			정수1입력:3	연산자 입력:+ 	정수2 입력: 5	3+5 = 8
public class Q507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int a =sc.nextInt();
		System.out.print("연산자 입력: ");
		String b = sc.next();
		char d = b.charAt(0);
		System.out.print("정수2 입력: ");
		int c = sc.nextInt();
		System.out.print(a + b + c +"= ");
		switch(d) {
		case '+' :
			System.out.println(a+c);
			break;
		case '-' : 
			System.out.println(a-c);
			break;
		case '*' :
			System.out.println(a*c);
			break;
		case '/' :
			System.out.println(a/c);
			break;
		}
	}
}
