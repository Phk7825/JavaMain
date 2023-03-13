package day4;

import java.util.Scanner;

public class Ex402 {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 정수 값 하나 입력받아 (a). / 정수 값 하나를 더 입력받아(b).
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// TODO : 두 값들 중 큰 값, 작은 값을 출력. (두 값이 다르다고 가정함)
		int max = a>b? a:b;
		int min = a<b? a:b;
		System.out.println("큰값: " +max);
		System.out.println("작은 값: " + min);
	}
}
