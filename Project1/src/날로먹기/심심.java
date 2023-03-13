package 날로먹기;

import java.util.Scanner;

public class 심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a , b ;
		int arr[] = new int[T];
		for(int i = 0; i <T ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
		}
		for(int sum: arr) {
			System.out.println(sum);
		}
	}
}
