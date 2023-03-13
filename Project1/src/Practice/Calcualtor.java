package Practice;

import java.util.Scanner;

public class Calcualtor {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("입력하세요");
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		boolean isContain1 = b.contains("+");
		boolean isContain2 = b.contains("-");
		boolean isContain3 = b.contains("*");
		boolean isContain4 = b.contains("/");
		if(isContain1)
		{
		System.out.println(a+c);
		}
		if(isContain2)
		{
			System.out.println(a-c);
		}
		if(isContain3)
		{
			System.out.println(a*c);
		}
		if(isContain4)
		{
			System.out.println((float)(a/c));
		}
		
	}
}
