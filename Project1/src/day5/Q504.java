package day5;

import java.util.Scanner;

// 알파벳을 하나 입력 받고, 대문자인지 여부를 출력.	// 아스키코드표 참조
//	(참조) 문자 입력 -----> String s = sc.next();
//					   char c = s.CharAt(0);
//	Ex) A (엔터) ----> 변수 C에는 'A'에 해당하는 65가 저장되어 있음.
//	(실행결과) 알파벳 입력: A(엔터)
//			A는 대문자임!
//			알파벳 입력 : b(엔터)
//			b는 대문자가 아님!
//	(고급화)----> 알파벳을 입력하지 않았으면, 알파벳을 입력할 때까지 반복해서 입력받도록 수정해보세요.
public class Q504 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for(;;) {
		System.out.print("알파벳 입력: ");
		String s = sc.next();
		char c = s.charAt(0);
		if(c <= 'z'&& c >='a') {
			System.out.println(s + "는 대문자가 아님!");
			break;
		}else if(c <='Z'&& c >='A'){
			System.out.println(s + "는 대문자임!");
			break;
			}
		}
	}
}
