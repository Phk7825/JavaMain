package day10;

import java.util.Scanner;

public class Q1005 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum = 0;
		for(;;) {
			System.out.print("소수 입력: ");
			int a = sc.nextInt();
			int cnt = 0;			//소수다
			for(int i = 1; i <=a ; i++) {
				if(a%i==0) 
					cnt++;
			}
				if(cnt == 2) {
					sum += a;
				}else
					break;
		}
		System.out.println("지금까지 입력한 소수들의 합은 " + sum + "입니다.");
	}
}
