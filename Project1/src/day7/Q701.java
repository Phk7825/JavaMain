package day7;

import java.util.Scanner;

//Q701.	고급.
//(실행결과) 입력 : 4 (엔터)
//1
//2 3
//4 5 6
//7 8 9 10
public class Q701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int j;
		for (int i = 1; i <= a; i++) { // 몇 줄인지
			for (j = 1; j <= i; j++) {
				System.out.print(sum+ j + " ");
			}
			sum += i;
			System.out.println();
		}
	}
}
