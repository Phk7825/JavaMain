package day15;

import java.util.Scanner;

public class Ex1502 {
	static void showAllSum(int a, int b, int c) {
		System.out.print(a + " + ");
		if(c >= 0) {
		System.out.print(b + " + ");
		a += c;}
		else {
			System.out.print(b + " - ");
		c = -c;
		a -= c;}
		System.out.print(c + " = ");
		a += b;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 : ");
		int a = sc.nextInt();		 //3 (엔터)
		System.out.println("정수 2 : ");
		int b = sc.nextInt();		 //5 (엔터)
		System.out.println("정수 3 : ");
		int c = sc.nextInt();		 //-1 (엔터)
		showAllSum(a,b,c);		// _ + _ + _ = _
		System.out.println("a : " + a);
	}
}
