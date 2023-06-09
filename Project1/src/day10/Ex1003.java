package day10;

import java.util.Random;

// 난수 발생.
public class Ex1003 {
	public static void main(String[] args) {
//		1,2,3,4,5,6 중에 하나를 난수 발생. --> 10회 반복
//		방법 1) Math.random()
//		1,2,3,4,5,6, ---> 	0,1,2,3,4,5	(0부터 6미만)
//							0 ~ 5.9999999999999999999 = (0 ~ 0.9999999999999)*6
//							(int)(Math.random() * 6) : 0,1,2,3,4,5
//				(비교)		(int)Math.random() * 6 : 0
		for(int i = 1; i <= 10; i++) {
			int r = (int)(Math.random() * 6) + 1;
			System.out.print(r + " ");
		}
		System.out.println();
		
//		 방법 2) Random 클래스 방법. ( + seed값 설정)
		Random rd = new Random();
//		rd.setSeed(System.currentTimeMillis());
		rd.setSeed(1000);
		for(int i =  1; i <= 10 ; i++) {
			int r = rd.nextInt(6) + 1;		// rd.nextInt(6) : 0~5 중에서 골라준다.
			System.out.print(r + " ");
		}
	}
}
