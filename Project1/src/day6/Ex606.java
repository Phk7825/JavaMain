package day6;

import java.util.Scanner;

public class Ex606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력: ");
		int a = sc.nextInt();
		System.out.print("b 입력: ");
		int b = sc.nextInt();
		int i;
		int sum = 0;
		int m = 1;
		for(i = a; i <=b ; i++) {
			sum += i;
			m *= i;
		}
		System.out.println(a + "부터 " + b + "까지의 누적합 = " + sum);
		System.out.println(a + "부터 " + b + "까지의 누적곱 = " + m);
	}
}
