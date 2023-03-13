package 날로먹기;

import java.util.Scanner;

public class 심심심심심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 입력: ");
		double a = sc.nextDouble();
		System.out.print("연산자 입력: ");
		String b = sc.next();
		char d = b.charAt(0);
		System.out.print("2 입력: ");
		double c = sc.nextDouble();
		System.out.print((a%(int) a==0? (int) a+"":a+"") + b + (c%(int) c==0? (int) c+"":c+"") + "= ");

		switch (d) {
		case '+':
			System.out.println((a + c) % (int)(a + c) == 0 ? (int)(a + c)+"" : (a + c)+"");
//			if ((a + c) % (int)(a + c) == 0)
//				System.out.print((int)(a + c));
//			else
//				System.out.print(a + c);
			break;
		case '-':
			System.out.println((a - c) % (int)(a - c) == 0 ? (int)(a - c)+"" :(a - c)+"" );
//			if ((a - c) % (int)(a - c) == 0)
//				System.out.print((int)(a - c));
//			else
//				System.out.print(a - c);
			break;
		case '*':
			System.out.println((a * c) % (int)(a * c) == 0 ? (int)(a * c)+"":(a * c)+"");
//			if ((a * c) % (int)(a * c) == 0)
//				System.out.print((int)(a * c));
//			else
//				System.out.print(a * c);
			break;
		case '/':
			System.out.println((a / c) % (int) (a / c) == 0 ?(int)(a / c)+"": (a / c)+"");
//			if ((a / c) % (int) (a / c) == 0)
//				System.out.print((int)(a / c));
//			else
//				System.out.print(a / c);
			break;	
		}
	}
}
