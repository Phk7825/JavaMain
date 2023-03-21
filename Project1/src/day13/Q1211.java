package day13;

import java.util.Arrays;

public class Q1211 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 50) + 51;
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("생성된 배열 : " + Arrays.toString(arr));
		System.out.println("최대값 - 최소값  = " + max + " - " + min + " = " + (max - min));
	}
}
