package day9;

import java.util.Scanner;

public class Q909 {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <= 5 ; i++) {
		int a = (int) ((Math.random() * 10)+1);		// 숫자
		int b = (int) (Math.random() * 4);			// 부호
		int c = (int) ((Math.random() * 10)+1);		// 숫자
		System.out.print(i +"번문제: ");
		switch(b){
		case 0 :
			b = a+c;
			System.out.print(a+ " + " + c + "= ");
			break;
		case 1 :
			b = a-c;
			System.out.print(a +" - " + c + "= ");
			break;
		case 2 :
			b = a*c;
			System.out.print(a +" * " + c + "= ");
			break;
		case 3 :
			b = a/c;
			while(true) {
			if(a%c==0) {
				System.out.print(a +" / " + c + "= ");
				break;
			}
			}
		}
		int d = sc.nextInt();
		if(b == d) {
			cnt++;
		}
		}		//for문
		System.out.println("5 문제중" + cnt + " 문제를 맞췄습니다!");
	}	// main
}
