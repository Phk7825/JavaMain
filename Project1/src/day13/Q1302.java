package day13;

import java.util.Arrays;

public class Q1302 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int tmp;
		for(int i = 0; i <= 5; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}

		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
