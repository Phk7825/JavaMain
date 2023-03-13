package day7;

import java.util.Scanner;

//Q707(고급) (실행결과) 입력 : 5 (엔터)
//1 2 3 4 5 
//6 7 8 9 
//10 11 12 
//13 14
//15
public class Q707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int j;
		for (int i = a; i >= 1; i--) { // 몇 줄인지
			for (j = 1; j <= i; j++) {
				System.out.print(sum+ j + "\t");
			}
			sum += i;
			System.out.println();
		}
	}
}
