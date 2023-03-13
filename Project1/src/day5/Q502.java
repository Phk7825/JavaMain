package day5;

import java.util.Scanner;
// 연도 입력 받아서 윤년인지 여부 확인 코드
//400으로 나누어 떨어지면 윤년임
//그게 아니라면 4로 나누어 떨어지면서 100으로는 나누어 떨어지지 않으면 윤년임
public class Q502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int i = sc.nextInt();
		if(i%400 == 0) {
			System.out.println("윤년임");
		} else {
			System.out.println("윤년" + (i%4==0 && i%100!=0 ? "임" : "이 아님"));
		}
	}
}
