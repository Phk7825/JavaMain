package day5;

public class Ex501 {
	public static void main(String[] args) {
		int a = 7;
		int b = 9;
		int c = 5;
		int max = (a>b && a>c) ? a: (b>c ? b:c);
		System.out.println("max: " + max);
	}
}
