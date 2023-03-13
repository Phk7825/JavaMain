package day5;

import java.util.Scanner;

// 실행결과 정수 입력:	 13(엔터) 
//				13의 절대 값 = 13
//		정수 입력: -7(엔터)
//		-7의 절대 값 = 7
public class Ex501연습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
//		int b = (a >= 0 ? a : -a);
		System.out.println(a + "의 절대 값 = " + (a >= 0 ? a : -a));
		System.out.print("정수 입력: ");
		int c = sc.nextInt();
//		int d = (c >= 0 ? c : -c);
		System.out.println(c + "의 절대 값 = " + (c >= 0 ? c : -c));
		
	}
}
