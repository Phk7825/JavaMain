package day3;

public class Ex302 {
	public static void main(String[] args) {
		byte b = 3;
		short s = b;	// 자동 형 변환 : byte -> short
		int i = s;		// 자동 형 변환 : short -> int
		long lo = i;	// 자동 형 변환 : int -> long
		float f = lo;	// 자동 형 변환 : long -> float (정수->실수)
		double d = f;	// 자동 형 변환 : float -> double
		System.out.println(d);	// 3.0
		
		char ch = 'A';
		System.out.println(ch);		// A
		char ch2 = 65;
		System.out.println(ch2);	// A
		int i2 = ch;	// 자동 형 변환 : char -> int
		System.out.println(i2); 	// 65
		
//		char ch3 = 'ABC';			//ERR.
//		char ch4 = '';				//ERR.
		// (참고)
		String s3 = "ABC";
		String s4 = "";		// '빈 문자열'
		
		byte b2 = 65;
//		char ch5 = b2;		// 자동 형 변환 X
		int num = (int)d;	// 강제 형 변환. (주의: 변수의 타입이 바뀌는 게 아니라 값의 타입이 변할뿐)
		
		int num2 = (int)d * 3;
		int num3 = (int)(d * 3);
		
		System.out.println(num2);		//9
		System.out.println(num3);		//9
	}
}
