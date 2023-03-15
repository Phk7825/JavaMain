package day10;

import java.util.Scanner;

public class Q1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		boolean b = true;
		for(int i = 2; i <num ; i++){
		if(num%i ==0) {
		 b= true;
		break;}
		else
		 b = false;
	}
		System.out.println(b);
	}
}
