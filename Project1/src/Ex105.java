// ++와 --:
// Ex) int num = 5;
//	   num++;  // num의 값이 1 증가!
//	   sysout(num);  // 6
public class Ex105 {
	public static void main(String[] args) {
		byte b = 126;
		System.out.println(b); //126
		b++;
		System.out.println(b); //127
		b++;
		System.out.println(b); //-128
		//1) byte 타입의 변수로는 절대로 +128을 표현할 수 없다!!
		//2) [고급] 그 값이 -128이 됨.
	}
}
