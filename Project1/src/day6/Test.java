package day6;

public class Test {
	public static void main(String[] args) {
		byte b1 = 2;
		byte b2 = 3;
//		byte b3 = b1 + b2;			// (int) + (int)로 형변환 되어서 뜨게 된다.
		
		char c = 65;
		System.out.println(c);		// A
//		c = c + 32;					// (int) + 32 로 이해되어버림
		System.out.println(c);		// 위의 c를 (char)(c+32)로 바꿔주면 가능!
		
	}
}
