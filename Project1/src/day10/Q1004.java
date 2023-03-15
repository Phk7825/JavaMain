package day10;

import java.util.Scanner;

public class Q1004 {
	public static void main(String[] args) {
		int sum2 = 0;
		int sum[] = new int[100];
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력: ");
			int a = sc.nextInt();
			if (a != 0) {
				for (int j = 0; j < i; j++) {
					if (a == sum[j]) {
						System.out.println("중복되었습니다 다시 입력해주세요!");
						cnt2++;
					}
				}
				if (cnt2 >= 1) {
					sum[i] = 0;
					sum2 += 0;
					i--;
				} else {
					sum[i] = a;
					sum2 += a;
					cnt++;
				}
				continue;
			} else {
				System.out.print("지금까지 입력한 값들의 합: ");
				for (i = 0; i < cnt; i++) {
					if (i == cnt - 1) {
						System.out.print(sum[i]);
					} else
						System.out.print(+sum[i] + "+");
				}
				break;
			}
		}
		System.out.println("= " + sum2);
	}
}
