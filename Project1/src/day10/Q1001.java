package day10;

public class Q1001 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print(a + " , " + b);
		for (int i = 1; i <= 20; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" , " + c);
		}
	}
}
