package day5;

import java.util.Scanner;

// 계산기			1입력:3	연산자 입력:+ 	수2 입력: 5.5	3+5.5 = 8.5
// 계산기			1입력:3.5	연산자 입력:- 	수2 입력: 2.5	3.5-2.5 = 1
public class Q508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 입력: ");
		double a = sc.nextDouble();
		System.out.print("연산자 입력: ");
		String b = sc.next();
		char d = b.charAt(0);
		System.out.print("2 입력: ");
		double c = sc.nextDouble();
		System.out.print((a%(int)a==0?(int)a+"":a+"")+ " " + b + " " +(c%(int)c==0?(int)c+"":c+"") + " = ");

		switch (d) {
		case '+':
			System.out.println((a + c) % (int)(a + c) == 0 ? (int)(a + c)+"" : (a + c)+"");
			break;
		case '-':
			System.out.println((a - c) % (int)(a - c) == 0 ? (int)(a - c)+"" : (a - c)+"");
			break;
		case '*':
			System.out.println((a * c) % (int)(a * c) == 0 ? (int)(a * c)+"" : (a * c)+"");
			break;
		case '/':
			System.out.println((a / c) % (int)(a / c) == 0 ? (int)(a / c)+"" : (a / c)+"");
			break;	
		}
	}
}
