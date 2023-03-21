package day14;

import java.util.Arrays;

public class Q1401 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {6,4,2};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = new int[7];
		for(int i = 0 ; i < 7 ; i++) {
			if(i > arr1.length-1) {
				arr3[i] = arr2[i-arr1.length];
			}else
			arr3[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}
