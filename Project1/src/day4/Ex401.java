package day4;

import java.util.Scanner;
// 화씨온도 -> 섭씨 온도 공식 : C = 5 / 9 X (F - 32)	 // F:화씨 C:섭씨
// 자동 import : [Ctrl] + [Shift] + [0]
public class Ex401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// "스캐너 객체 생성" 문장.
		System.out.print("화씨 온도를 입력하세요 : ");
		int f = sc.nextInt();	// 스캐너 객체 이용해서, 정수 값 입력.
		
		// 화씨 100도 -> 섭씨 _________도
//		System.out.println("화씨 " + f + "도-> 섭씨 " + ((5/9f)*(f-32)) + "도");		// 이건 내 방법, 37.77778 출력
		float c = (5.0f / 9 * (f-32));	// 5.0f라고 안 하면 0이 출력되지요
		System.out.println("화씨" + f + "도-> " + c + "도");		// 37.77778 출력
	}
}
