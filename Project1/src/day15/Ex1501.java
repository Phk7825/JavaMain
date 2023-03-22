package day15;

public class Ex1501 {
	static void m2(int n, String a , double d) {			//m2 안에 있는 것은 파라미터라고 함(매개변수)
		System.out.print(n + " ");
		System.out.print(a + " ");
		System.out.println(d);
	}
	static void SayHello(String b) {
		System.out.println("\"Hello " + b + "!\"");
	}
	public static void main(String[] args) {
		m2(3, "야!!" , 13);								// 여기 m2 안에 있는 것은 인수(argument)
		SayHello("YG");
	}
}
