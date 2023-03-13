package day7;

import java.util.Scanner;

//Q708. (실행결과) 입력 : 4 (엔터)			// 'Consolas'
//   *
//  **
// ***
//****
public class Q708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <=(a-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
