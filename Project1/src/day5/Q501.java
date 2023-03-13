package day5;

import java.util.Scanner;

public class Q501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for(int j = 1; j < 3; j++) {
//			System.out.print("정수 입력 :" );
//			int i = sc.nextInt();
//		if(i> 10 && i < 30) {
//			System.out.println(i + "은 10 보다 크고 30보다 작은 수임!");
//		}else	{
//			System.out.println(i + "은 10 보다 크고 30보다 작은 수가 아님!");
//			}
//		}
		System.out.print("정수 입력 :" );
		int i = sc.nextInt();		
		System.out.println(i + "은 10보다 크고 30보다 작은 수" + (i> 10 && i < 30? "임!" : "가 아님!"));
	}		
}
