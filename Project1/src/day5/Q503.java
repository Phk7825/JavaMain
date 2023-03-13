package day5;

import java.util.Scanner;

// 물은 0도에서 얼고 100도에 끓는다, 온도를 의미하느 변수 temp에 정수 값을 하나 입력 받아서, 물이 액체 상태(0보다 크고 100보다 작다)이면 "액체상태"라고 출력
//	실행결과 : 온도 입력 : 78(엔터)
//			액체 상태임!
//			온도 입력 : 128(엔터)
//			액체 상태가 아님!
public class Q503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("온도 입력: ");
		int temp = sc.nextInt();
		if(temp > 0 && temp < 100) {
			System.out.println("액체 상태임");
		} else {
			System.out.println("액체 상태가 아님!");
		}
			}
}
