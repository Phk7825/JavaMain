package day7;

public class Q705 {
	public static void main(String[] args) {
		for (int n = 3; n >= 1; n--) {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
