package day5;

//	
public class Ex502 {
	public static void main(String[] args) {
		int a = 0x00000002;
				// 00000000	00000000 00000000 00000010
		a = a << 1;
				// 00000000 00000000 00000000 00000100
		System.out.println(a);
		
		a = a << 2;
				// 00000000	00000000 00000000 00010000
		System.out.println(a);
		
		a = 128;
				// 00000000 00000000 00000000 10000000
		a = a >> 1;
				// 00000000	00000000 00000000 01000000
		System.out.println(a);
		
		// 이하 고급 (어려우면 스킵하세요)
		a = 0xffffff80;
				// 11111111 11111111 11111111 10000000 : -128
		a = a >> 1; 
				// 11111111 11111111 11111111 11000000 : -64
		System.out.println(a);
		
		a = 0xffffff80;
				// 11111111 11111111 11111111 10000000 : -128
		a = a >>> 1;
				// 01111111 11111111 11111111 11000000 : 2147483584
		System.out.println(a);
		System.out.println(a + 63);						// 2147483647 int 표현의 최대값
		
		System.out.println(Integer.MAX_VALUE);			// 2147483647
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
