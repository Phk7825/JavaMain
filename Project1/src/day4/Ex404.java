package day4;

public class Ex404 {
	public static void main(String[] args) {
		System.out.println(0b0001 & 0b0011);	// 1 (이해)
		System.out.println(1 & 3);		// 1
//		System.out.println(1 && 3);		// Error

		int a = 2;
		System.out.println((a-1) & (a+1));	// 1
		
		// ~ 연산자 (비트 연산자)	-- (고급)
		byte b = 0b00000111;	// 00000000 00000000 00000000 00000111	0은 뭐 딱히 안 중요하다 ^^
		System.out.println(~b);
		
		// (고오급) 히오스인줄..
		byte b2 = (byte) 0b11110111;	// 11111111 11111111 11111111 11110111	1은 0과 다르게 없애면 좀 그렇다
		System.out.println(~b2);
		
	}
}
