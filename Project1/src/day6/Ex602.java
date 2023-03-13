package day6;

public class Ex602 {
	public static void main(String[] args) {
		// 1 2 3 4 for문으로
		int i;
		for (i = 1; i <= 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println("i : " + i);
		// (줄바꿈)
		System.out.println();
//		System.out.print();		// 이건 정의가 안되어 있다

		// 1 2 3 4 while문으로
		i = 1;
		while (i <= 4) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		// 1 2 3 4 do~while문으로
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 4); // 세미콜론(;) 잊지 맙시다
		System.out.println();

		// 0 2 4 6 8 3가지 방법으로
		for (i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();

		i = 0;
		do {
			System.out.print(i + " ");
			i += 2;
		} while (i < 10);
		System.out.println();

		// 1 4 7 10
		for (i = 1; i <= 10; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 3;
		}
		System.out.println();

		i = 1;
		do {
			System.out.print(i + " ");
			i += 3;
		} while (i <= 10);
		System.out.println();

		// 100 90 80 70
		for (i = 100; i >= 70; i -= 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		i = 100;
		while (i >= 70) {
			System.out.print(i + " ");
			i -= 10;
		}
		System.out.println();
		i = 100;
		do {
			System.out.print(i + " ");
			i -= 10;
		} while (i >= 70);
		System.out.println();

		// 1 4 9 16 25 36
		for (i = 1; i <= 6; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		i = 1;
		while (i <= 6) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();

		i = 1;
		do {
			System.out.print(i * i + " ");
			i++;
		} while (i <= 6);

	}
}
