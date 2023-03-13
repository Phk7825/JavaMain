package 날로먹기;

import java.util.Scanner;

// 2개 값 입력 받아서 몇단부터 몇단까지 적었는데 9단 이후 적으면 9단 이후부터 자기숫자까지 곱하도록 나오기
public class 심심심심심심심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i <= 9) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + "= " + i * j);
				}
				System.out.println();
			}
			if (i > 9) {
				for (int j = 1; j <= i; j++)
					System.out.println(i + " * " + j + "= " + i * j);
			}
			System.out.println();
		}
	}// main
}