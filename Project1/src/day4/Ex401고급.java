package day4;

import java.util.Scanner;

public class Ex401고급 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// "스캐너 객체 생성" 문장.
		System.out.print("화씨 온도를 입력하세요 : ");
		int f = sc.nextInt();	// 스캐너 객체 이용해서, 정수 값 입력.
		
		float c = (int)((5/9f)*(f-32)*10)/10f;
//		float c = ((int)(5/9f) * (f-32));	// 5.0f라고 안 하면 0이 출력되지요
		System.out.println("화씨" + f + "도-> " + c + "도");
	}
}
