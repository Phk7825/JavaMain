package day4;
//Q402. 연습.
//삼항연산자를 사용해서, 3개의 정수 중 가장 큰 수를 출력.
//int a = 17;
//int b = 25;
//int c = 8;
//// TODO : 여기에 코드 작성.
//sysout("max : " + max);
public class Q402연습 {
	public static void main(String[] args) {
		int a = 17;
		int b = 25;
		int c = 40;
		int max = a>b? (a>c? a:c):(b>c? b:c);
		System.out.println("max: " +max);
	}
}
