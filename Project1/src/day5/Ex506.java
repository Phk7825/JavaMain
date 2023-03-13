package day5;

import java.util.Scanner;

public class Ex506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
//		 코드 작성
//		  __점은 __ 학점입니다.
//		 ----> (90점 이상이면 A / 80점 이상이면 B / 70..... C / 60....... D / E)
		System.out.print(score + "점은 ");
		switch(score/10) {
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		default:
			System.out.print("F");
		}
//		if (score >= 90)
//			System.out.print("A");
//		else if (score >= 80)
//			System.out.print("B");
//		else if (score >= 70)
//			System.out.print("C");
//		else if (score >= 60)
//			System.out.print("D");
//		else
//			System.out.print("F");
		System.out.println("학점입니다.");
		
//		(+고급화)0 이상 100이하의 정수를 입력하지 않은 경우 "0부터 100 사이의 값을 입력해주세요"라고 출력하고 다시 입력받으세요 제대로 입력할때까지
		
		
		
		
	}
}
