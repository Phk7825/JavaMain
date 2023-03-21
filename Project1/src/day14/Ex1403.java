package day14;

import java.util.Arrays;

public class Ex1403 {
	public static void main(String[] args) {
		int [][] arr = new int[3][3];
		int sum = 0;
		int avg = 0;
		int max = arr[0][0];
		int min = 10000000;
		for(int i = 0 ; i <= 2; i++) {
			for(int j = 0 ; j <= 2; j++) {
				arr[i][j] = i*3 + j + 1 ; 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i <= 2; i++) {
			for(int j = 0 ; j <= 2; j++) {
				arr[i][j] = i*3 + j + 1 ; 
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		for(int i = 0 ; i <= 2; i++) {
			for(int j = 0 ; j <= 2; j++) {
				arr[i][j] *= 10;
				sum += arr[i][j];
				avg = sum/9;
				if(max < arr[i][j])
					max = arr[i][j];
				if(min > arr[i][j])
					min = arr[i][j];
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("모든 요소의 합: " + sum);
		System.out.println("모든 요소의 평균 : " + avg);
		System.out.println("최대 값: " + max);
		System.out.println("최소 값: " + min);
	}
}
