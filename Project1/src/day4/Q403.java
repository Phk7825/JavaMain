package day4;

import java.util.Scanner;

//(실행결과) 정수입력: 15327(엔터)
//		     거꾸로: 72351
//		  모든 자릿수의 합: 18 // 7 + 2 + 3 + 5 + 1 = 18
public class Q403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		int reverse = 0; 
		int sum = 0;
		int A;
		
//		while(a!=0)	{
//			A = a%10;
//			sum += A;
//			reverse = reverse * 10 + A;
//			a /= 10;	
//		}
		
		for(;;) {
			A = a%10;
			sum += A;
			reverse = reverse * 10 + A;
			a /= 10;
			if(a==0) {
				break;
			}
		}
		
		System.out.println(reverse);
		System.out.println(sum);
	}
}
