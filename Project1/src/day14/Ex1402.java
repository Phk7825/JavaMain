package day14;

import java.util.Arrays;

public class Ex1402 {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };
			// 출력 --> '행'별로 Arrays.toString()을 사용
			System.out.println(Arrays.toString(arr[0]));
			System.out.println(Arrays.toString(arr[1]));
			
			// 연습
			// [10 20]
			// [30 40]
			// [50 60]
			int[][] arr2 = new int[3][2];
			arr2[0][0] = 10;
			arr2[0][1] = 20;
			arr2[1][0] = 30;
			arr2[1][1] = 40;
			arr2[2][0] = 50;
			arr2[2][1] = 60;
			for(int i = 0 ; i <= 2 ; i++) {
				System.out.println(Arrays.toString(arr2[i]));
			}
	}
}
