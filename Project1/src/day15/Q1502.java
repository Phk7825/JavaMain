package day15;

public class Q1502 {
	static void showAdd(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	static void showSub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	static void showMul(int a, int b) {
		System.out.println(a + " * " + b + " = " + a*b);
	}
	static void showDiv(int a,int b) {
		System.out.println(a + " / " + b + " = " + ((double)a/b));
	}
	
	public static void main(String[] args) {
		showAdd(5,3);
		showSub(5,3);
		showMul(3,4);
		showDiv(5,4);
	}
}
