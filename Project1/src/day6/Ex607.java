package day6;

import java.util.Scanner;

public class Ex607 {
	public static void main(String[] args) {
		int i;
		int m = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		int a = sc.nextInt();
		for(i = 1; i <=9; i++) {
			m = a*i;
			System.out.println(a + " * " + i + "= " +m);
		}
	}
}
