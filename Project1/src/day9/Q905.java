package day9;

public class Q905 {
	public static void main(String[] args) {
		int a = -1;
		for(int i = 1 ; i <= 10; i++) {
			a *= -1;
			System.out.print(i*i*a + " ");
		}
	}
}
