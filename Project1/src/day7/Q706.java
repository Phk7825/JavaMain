package day7;

import java.util.Scanner;

// 입력:5(엔터)   AAAAA
//				BBBB
//				CCC
//				DD
//				E
public class Q706 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i = a; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(65+b));
			}
			b +=1;
			System.out.println();
		}
	}
}
