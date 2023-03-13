package day8;

import java.util.Scanner;

public class Q803 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		System.out.print("d: ");
		int d = sc.nextInt();

		for(int i = a ; i <=b ; i++) {
			if(i>=c && i<=d)
				continue;
				System.out.print(i + " ");
		}
	}
}
