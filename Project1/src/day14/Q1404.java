package day14;

import java.util.Arrays;
import java.util.Random;


public class Q1404 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[][] arr = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] arr3 = new int[3][3];
		
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				arr[i][j] = rd.nextInt(9) + 1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				arr2[j][0] = arr[2][j];
				arr2[j][1] = arr[1][j];
				arr2[j][2] = arr[0][j];
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
		System.out.println();
		for(int i = 0 ; i < 3 ; i++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				arr3[0][j] = arr[j][2];
				arr3[1][j] = arr[j][1];
				arr3[2][j] = arr[j][0];
			}
			System.out.println(Arrays.toString(arr3[i]));
		}
		System.out.println();
		
	}
}