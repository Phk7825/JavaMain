package day7;

import java.util.Scanner;

//	실행결과 몇의 배수를 출력할까요 ? 5 (엔터)
//			5 10 15 20 25 .... 95 100 // 1~100사이의 정수들 중에서
//							11 (엔터)
//			11 22 33 44 55 .. 99 
public class Q702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1 ; i<=100 ; i++) {
			if(i%a==0) 		
			System.out.print(i + " ");
		}
	}
}
