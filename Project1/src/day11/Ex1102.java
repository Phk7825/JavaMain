package day11;

import java.util.Arrays;

public class Ex1102 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] = (i+1)*10;
			sum += arr[i];	
			System.out.print(arr[i] + " + " );
			if(i == 9)
			System.out.println(arr[i] + " = " + sum);
		}
		System.out.println();
//		System.out.print(Arrays.toString(arr));		// 4번
//		System.out.println();
//		System.out.println("sum : " + sum);			// 2번
	}
}
