package day13;

import java.util.Arrays;
import java.util.Scanner;

public class Q1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int digit = 0;
		int temp = a;
		while(temp > 0) {
			temp /= 10;
			digit++;
		}
		boolean[] arr = new boolean[digit];
		
		temp = 1;
		for(int i = 1; i <= digit -1; i++) {
			temp *= 10;
		}
		System.out.println("a : " + a);
		System.out.println("digit : " + digit);

		int idx = 0;
		while(temp > 0) {
			if((a/temp%10)%2 == 0)
				arr[idx] = true;
			temp /= 10;
			idx++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
