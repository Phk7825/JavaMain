package day9;

import java.util.Scanner;

public class Ex903 {
	public static void main(String[] args) {
		int sum2 = 0;
		int sum[] = new int[100];
		int cnt = 0;
		for (int i = 0; i >= 0; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("홀수만 입력: ");
			int a = sc.nextInt();
			if (a % 2 == 1) {				
				sum[i] = a;
				sum2 += a;
				cnt++;
				continue;
			}
			else {
				System.out.println("짝수가 입력되었음! 끝!");
				System.out.print("지금까지 입력한 모든 홀수의 합: ");
				for(i = 0 ; i < cnt;i++) {
				if(i == cnt-1) {
					System.out.print(sum[i]);
				}
					else
						System.out.print(+sum[i] + "+");
				}break;
			}
		}
		System.out.println("= " + sum2);
	}
}
