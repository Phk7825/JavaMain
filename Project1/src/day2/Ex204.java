package day2;
// '산술 연산자'( + - * / %)
// '대입연산자'(=)
// [정리] 연산자는 자료형이 같아야만 실행될 수 있음!
//		 3/2 ------>1
//		 3.0/2 ---->1.5
//		 3/2.0 ---->1.5
//		 3.0/2.0 -->1.5
public class Ex204 {
	public static void main(String[] args) {
		double a = 3;
		int b = 2;
		System.out.println(a + b);	//5
		System.out.println(a - b);	//1
		System.out.println(a * b);	//6
		System.out.println(a / b);  //1 (몫:int 기준) , 1.5 (double 기준)
		
		System.out.println(5 % 3);	//2 (나머지)
		
		// num: 37 ----> 237
		int num = 237;
		//1. 십의 자리 (3)
		System.out.println(num/10%10);
		//2. 일의 자리 (7)
		System.out.println(num%10);
		}
}
