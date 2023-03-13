package day5;

import java.util.Scanner;

public class Ex504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
//		 코드 작성
//		  __점은 __ 학점입니다.
//		 ----> (90점 이상이면 A / 80점 이상이면 B / 70..... C / 60....... D / E)
		System.out.print(score + "점은 ");
		if (score >= 90)
			System.out.print("A");
		else if (score >= 80)
			System.out.print("B");
		else if (score >= 70)
			System.out.print("C");
		else if (score >= 60)
			System.out.print("D");
		else
			System.out.print("F");
		System.out.println("학점입니다.");
	}
}
