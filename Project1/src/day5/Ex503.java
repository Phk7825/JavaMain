package day5;

public class Ex503 {
	public static void main(String[] args) {
		int n = 0x40fd70a4;		// (7.92)	정수가 아닌 실수로 계산하면
		int n2 = 1090351268;	// 0x40fd70a4의 십진수 값.
		
//		float f = n;		//1.09035123E9
//		float f2 = n2;		//1.09035123E9
		float f = Float.intBitsToFloat(n);		//7.92	
		float f2 = Float.intBitsToFloat(n2);	//7.92
		System.out.println(f + " , " + f2);
	}
}
