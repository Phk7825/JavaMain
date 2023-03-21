package day14;

import java.util.Arrays;

// 개발자 ----> "국비 출신" ,"국비 강사" 편견이 있다.

public class Ex1401 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 2, 5 };
		for (int n : arr) {
			if (n < 0) {
				n = -n;
			}
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.print(Arrays.toString(arr));
//		for(int i = 0 ; i <= arr.length-1 ; i++) {
//			System.out.print((arr[i] > 0? arr[i] : -arr[i])  + " ");
//		}
	}
}
