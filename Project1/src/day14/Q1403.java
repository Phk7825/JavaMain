package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Q1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1,3,2,4,5,};
		int[] arr2 = new int[6];
		int a = sc.nextInt();
		for(int i = 0 ; i < 6 ; i++) {
			if(i == 3)
				arr2[i] = a;
			else if(i > 3)
				arr2[i] = arr1[i-1];
			else
				arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
