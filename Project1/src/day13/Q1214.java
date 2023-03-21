package day13;

import java.util.Arrays;

public class Q1214 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0 ; i < 10; i ++) {
			arr[i] = (int)(Math.random()*99)+2;	
		}
		System.out.println("생성된 배열: " + Arrays.toString(arr));
		for(int i = 0; i < 10; i ++) {
			if(arr[i]%3 != 0) {
				if(arr[i]%3 == 1) 
					arr[i] -= 1;
				else
					arr[i] += 1;
			}
		}
		System.out.println("바꾼 배열 :" + Arrays.toString(arr) );
	}
}
