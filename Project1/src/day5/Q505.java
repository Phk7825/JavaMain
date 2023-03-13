package day5;

import java.util.Scanner;

// 문자를 하나 입력 받아서, 대문자이면 소문자로 바꿔서 출력하고, 대문자가 아니면 그냥 출력
//	실행결과) 문자 입력: a(엔터)
//			a
//			문자 입력: B(엔터)
//			b
//			문자 입력: !(엔터)
//			!
public class Q505 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력: ");
		String s = sc.next();
		char c = s.charAt(0);
		System.out.println((c>='A' && c <='Z')?(char)(c+32): c);
	}
}
