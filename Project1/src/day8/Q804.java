package day8;

import java.util.Scanner;

public class Q804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 소수(prime number)인지 아닌지 테스트 할 숫자.
		int cnt = 0; // 카운트(나누어 떨어지는 경우가 몇 번인지)
		for (int i = 2; i <= num-1; i++) {
			if (num % i ==0) {
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("소수");
		else
			System.out.println("소수 X");
	}
}
