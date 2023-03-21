package day13;

import java.util.Arrays;

public class Ex1301 {
	public static void main(String[] args) {
		int[][] arr= new int[2][3];

		// 출력#1
		for(int i = 0 ; i <=1 ; i ++) {
			for(int j = 0; j <= 2 ; j++) {
				arr[i][j] = i*30 + j*10 + 10;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 출력#2
		for(int i = 0 ; i <= 1; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
