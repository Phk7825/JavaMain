package day9;

import java.util.Scanner;

public class Q907 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 야구를 시작합니다.");
		int b = (int) ((Math.random() * 900) + 100); // 랜덤 숫자 b
		int strike = 0;
		int ball = 0;
		int finish = 0;
		int b1 = b / 100;
		int b2 = b / 10 % 10;
		int b3 = b % 100 % 10;
		for(;;) {
			if(b1!=b2 && b1 !=b3 && b2 != b3)
			break;
		}
		System.out.println(b);
		for (int i = 1; i <= 9; i++) {
			String s = sc.next();
			for (int j = 0; j <= 2; j++) {
				if (s.charAt(j) == b1+48 || s.charAt(j) == b2+48 || s.charAt(j) == b3+48) {
					if (b1+48 == s.charAt(0) || b2+48 == s.charAt(1) || b3+48 == s.charAt(2))
						strike++;
					else
						ball++;
				}
			}
			System.out.println(strike + "strike" + ball + "ball");
			if (strike == 3) {
				System.out.println("맞추셨습니다!");
				finish++;
			}
			ball = 0;
			strike = 0;
		} // main for문
		if (finish == 0)
			System.out.println("실패");
	} // main
}
