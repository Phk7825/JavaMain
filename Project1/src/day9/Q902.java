package day9;

import java.util.Scanner;

public class Q902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {	
			System.out.print("a :");
			int a = sc.nextInt();
			System.out.print("b :");
			int b = sc.nextInt();
			System.out.print("c :");
			int c = sc.nextInt();
			if ((a + b + c) % 2 == 0) {
				System.out.println("짝수임");
				break;
			} else {
				System.out.println("짝수가 아님");
			}
		}
	}
}
