package day3;

//	0.1을 백번 더하면?
public class Ex303 {
	public static void main(String[] args) {
		float f = 0f;		// 0.0 뒤에 f를 붙이는 이유?
		for(int i = 1; i <= 100; i++) {
			f += 0.1f;		// 또는 f = f + 0.1f;
		}
		System.out.println(f);		// 10.000002
		
		double d = 0.0;
		for(int i = 1; i <= 100; i++) {
			d += 0.1;
		}
		System.out.println(d);		// 9.99999999999998
		
		System.out.println(0.1 + 0.2);		// 0.30000000000000004

	}
}
