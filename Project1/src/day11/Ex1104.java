package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1104 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("과목 수 입력: ");
		int m = sc.nextInt();
		System.out.print("점수 1 : ");
		int a = sc.nextInt();
		System.out.print("점수 2 : ");
		int b = sc.nextInt();
		System.out.print("점수 3 : ");
		int c = sc.nextInt();
		System.out.print("점수 4 : ");
		int d = sc.nextInt();
		int[] arr = new int[] {a,b,c,d};
		System.out.println("입력한 점수 : " + Arrays.toString(arr));
		System.out.println("총점: " + (a+b+c+d));
		System.out.println("평균: " + (a+b+c+d)/m);
	}
}
