package day7;

import java.util.Scanner;

public class Q713 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <=a ; i++) {
			for(int j = 1; j<= i; j++) {
			if((i+j)%2==1) {
				System.out.print("0");
			}else
				System.out.print("1");
			}
			System.out.println();
		}
	}
}
