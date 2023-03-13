package day6;

//1부터 100까지의 정수들 중에서 짝수만 출력
public class Ex604 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//1부터 100까지의 정수들 중에서 2의 배수 3의 배수  7의 배수 출력
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//1부터 100까지의 정수들 중에서 1의 자리가 6인 수를 출력
		for (i = 1; i <= 100; i++) {
			if (i % 10 == 6) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//1부터 100까지의 정수들 중에서 10의 자리와 1의 자리가 같은 수를 출력
		for (i = 1; i <= 100; i++) {
			if (i % 10 == i / 10 % 10) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
