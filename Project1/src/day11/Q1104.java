package day11;

import java.util.Scanner;

public class Q1104 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(n) 입력: ");
		int a = sc.nextInt();
		System.out.print("배열 : [");
		for(int i = 0 ; i < 6 ; i++) {
			if(a == arr[i]) {
				b++;
			}
			arr[i] = (int)((Math.random()*11)-5);
				
			System.out.print(arr[i] + ",");
			if(i==5)
				System.out.print(arr[i]);
		}
		System.out.print("]");
		if(b >=1)
			System.out.print(" -> " + a + " 있음");
		else
			System.out.print(" -> " + a + " 없음");
	}
}
