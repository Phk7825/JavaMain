package day2;

import java.util.Scanner;

public class Ex211 {
	public static void main(String[] args) {
		// 스캐너 객체 생성 문장:
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
//		 정수 값을 하나 입력받아서, 양수/음수/0인지 판별.
		if(a>0) {
			System.out.println("양수임.");
			System.out.println("양수임.");
			System.out.println("양수임.");
			System.out.println("양수임.");
		}
		else if(a<0) {
			System.out.println("음수임.");
			System.out.println("음수임.");
			System.out.println("음수임.");
			System.out.println("음수임.");
		}
		else {
			System.out.println("0임.");
			System.out.println("0임.");
			System.out.println("0임.");
			System.out.println("0임.");
		}

 		 int num = 5;
		   if(num>0)
			    System.out.println("A");
		   		System.out.println("B");
		   	
		

//		 정수 값을 하나 입력받아서, 홀/짝 여부 판별.
//		if(a%2==0) {
//			System.out.println("짝수임.");
//		}
//		else {
//			System.out.println("홀수임.");
//		}
	}
}
	

