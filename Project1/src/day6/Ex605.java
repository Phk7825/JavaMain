package day6;

public class Ex605 {
	public static void main(String[] args) {
		// 1. 누적합 : 2+3+4+5 = 14
		int i;
		int sum = 0; // 0으로 초기화
		for (i = 2; i <= 5; i++) {
			sum += i;
		}
		System.out.println("sum: "+ sum);
		// 2. 누적곱 : 3*4*5*6 =360
		int m = 1; // 로 초기화
		for (i = 3; i <= 6; i++) {
			m *= i;
		}
		System.out.println("m= " + m);
	}
}
