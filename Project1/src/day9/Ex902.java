package day9;

import java.util.Scanner;

public class Ex902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean b = true;
		for(int i = 2; i < num ; i++) {
			if(num%i==0) { 
				b = true;	//소수가 아니다
				break;
			}
			else 
			b = false;		// 소수다
		}
		System.out.println(b);
	}
}
