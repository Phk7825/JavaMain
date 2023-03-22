package day15;

public class Q1501 {
	static void printStars(int i , char a) {
		for(int j = 1 ; j <= i ; j++) {
			System.out.print(a);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printStars(4,'*');
		printStars(6,'*');
	}
}
