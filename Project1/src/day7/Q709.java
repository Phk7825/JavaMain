package day7;

import java.util.Scanner;

public class Q709 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {		// 반복되는 횟수 만큼 줄 증가
			for (int j = 1; j <= i-1; j++) {	// 별갯수
				System.out.print(" ");
			}
			for (int j =a;j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
