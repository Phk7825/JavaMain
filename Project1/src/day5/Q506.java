package day5;

import java.util.Scanner;


//	요일을 한글로 입력받아서, 영어로 출력 SUN/MON/TUE/WED/THU/FRI/SAT
//	(실행결과)	요일 입력 : 일(엔터)
//			일요일은 SUN
//			요일 입력 : 월(엔터)
//			월요일은 MON
public class Q506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		if(c =='월') {
			System.out.println(c+ "요일은 MON");
		}
		else if(c == '화') {
			System.out.println(c+ "요일은 TUE");
		}
		else if(c == '수') {
			System.out.println(c+ "요일은 WED");
		}
		else if(c == '목') {
			System.out.println(c+ "요일은 THU");
		}
		else if(c == '금') {
			System.out.println(c+ "요일은 FRI");
		}
		else if(c == '토') {
			System.out.println(c+ "요일은 SAT");
		}
		else if(c == '일') {
			System.out.println(c+ "요일은 SUN");
		}
	}
}
