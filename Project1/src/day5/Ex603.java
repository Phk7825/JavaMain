package day5;

public class Ex603 {
	public static void main(String[] args) {
		int i;
		// 0 1 2 3 4 5 (for)
		for (i = 0; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 0 1 2 3 4 5 (while)
		i = 0;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		// 0 1 2 3 4 5 (do ~ while)
		i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);
		System.out.println();

		// 6 5 4 3 2
		for (i = 6; i >= 2; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		i = 6;
		while (i >= 2) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();

		i = 6;
		do {
			System.out.print(i + " ");
			i--;
		} while (i >= 2);
		System.out.println();
	}
}
