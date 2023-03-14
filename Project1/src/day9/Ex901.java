package day9;

import java.util.Scanner;

public class Ex901 {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				cnt++;
		}
		if (cnt == 2)
			System.out.println("소수");
		else
			System.out.println("소수가 아님");
	}
}
