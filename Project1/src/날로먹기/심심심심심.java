package 날로먹기;

public class 심심심심심 {
	public static void main(String[] args) {
		double a = 5;
		double c = 3;
		char b = '+';
		int e = (int) a;
		int f = (int) c;

		System.out.println("(a % e)==0 : " + ((a % e)==0));
		System.out.println("(c % f)==0 : " + ((c % f)==0));
		System.out.println("(c==f) : " + (c==f));
	
		System.out.println((a % e == 0 ? e+"" : a+"") + (b+"") + (c == f ? f+"" : c+"") + "= ");
		
		if (a % e == 0 && c % f == 0) {
			System.out.print(e + (b+"") + f + "= ");
		} else if (a % e != 0 && c % f == 0) {
			System.out.print(a + (b+"") + f + "= ");
		} else if (a % e == 0 && c % f != 0) {
			System.out.print(e + (b+"") + c + "= ");
		} else if (a % e != 0 && c % f != 0) {
			System.out.print(a + (b+"") + c + "= ");
		}
		
		String test1 = String.valueOf(5);
		String test2 = 5 + "";

		
		
		
		
		
//		if (a % e == 0 && c % f == 0) {
//		System.out.print(e + b + f + "= ");
//	} else if (a % e != 0 && c % f == 0) {
//		System.out.print(a + b + f + "= ");
//	} else if (a % e == 0 && c % f != 0) {
//		System.out.print(e + b + c + "= ");
//	} else if (a % e != 0 && c % f != 0) {
//		System.out.print(a + b + c + "= ");
//	}
	}
}
