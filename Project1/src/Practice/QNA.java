package Practice;

import java.util.Scanner;

public class QNA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요  ");
		int a = sc.nextInt();
		System.out.print("이진수 변환 값: ");
		for(int i = 1024; i > 0 ; i/=2) {
			if(a<i) 
			{
				System.out.print("");
			}
			else if(a >= i)
			{
			System.out.print(1);
			a = a-i;
			} 
			else if(a==0) {
				System.out.println("0");
			}
		}	
	}
}

