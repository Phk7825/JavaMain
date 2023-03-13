package day7;

import java.util.Scanner;

public class Q714 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int i;
		for (i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
					sum3 +=j;
				}
				sum3 +=i;
				System.out.print(" "); // 첫줄 띄어쓰기
				sum4 += sum3;
		}
		System.out.print(sum4); // 첫줄 띄어쓰기
			 for (i = 0; i <= a; i++) {
				for (int j = a; j >= i + 1; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(sum + j + " ");
					sum2 = sum * j + (1 + j) * j / 2;
				}
				if (i != 0)
					System.out.print(sum2);
				sum += i;
				System.out.println();
			}
		}
	}

