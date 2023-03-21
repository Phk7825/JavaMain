package day14;

import java.util.Arrays;

public class Q1402 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,2,4,5};
		int d = 2;
		int[] arr2 = new int[4];
		for(int i = 0 ; i < 5; i++) {
			if(i > d)
			arr2[i-1] = arr1[i];
			else
			arr2[i] = arr1[i];
				
			
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
	}
}
