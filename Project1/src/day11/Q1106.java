package day11;

public class Q1106 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int tmp;
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 9 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");
	}
}
