package Practice;

import java.util.Scanner;

//1. int형 변수 x 10보다 크고 20보다 작을때 true인 조건식
//2. char형 변수 ch가 공백이나 탭이 아닐 때true인 조건식
//3. char형 변수 ch가 'x'또는 'X'일때 true인 조건식
//4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 
//5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을때 true인 조건식
//7. boolean형 변수  powerOn가  false일 때 인 true인 조건식
//8. 문자열 참조변수str이 "yes"일 때 true인 조건식
public class Ex309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt() ;
//	int year = sc.nextInt() ;
		String str ="yes";
//		char ch = sc.next().charAt(0);
// 		1번 문제
//		if(x>10 && x<20) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
//		2번 문제
//		if(ch!=' ' && ch!= '\t') {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
//		3번 문제
//		if(ch=='x' || ch=='X')	{
//			System.out.println(true);
//			}
//		else {
//			System.out.println(false);
//		}
//		4번 문제
//		if(ch>='0' && ch<='9')	{
//			System.out.println(true);
//			}
//		else {
//			System.out.println(false);
//		}
//		5번 문제
//		if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z'))
//				{
//			System.out.println(true);
//			}
//		else {
//			System.out.println(false);
//		}
//		6번 문제
//		if(ch>='0' && ch<='9')	{
//			System.out.println(true);
//			}
//		else {
//			System.out.println(false);
//		}
//		7번 문제
//		if((year%400==0 || year%4==0) && year%100!=0)	{
//			System.out.println(true);
//			}
//		else {
//			System.out.println(false);
//		}
//		8번 문제
		if(str=="yes") {
			System.out.println(true);
			}
		else {
			System.out.println(false);
			}
		}
	}
