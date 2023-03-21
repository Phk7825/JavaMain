package day13;

import java.util.Arrays;

public class Q1209 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = (int) (Math.random() * 21) * 5;
		}
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;
		System.out.println("생성된 점수 배열 : " + Arrays.toString(arr));
		System.out.println("총점 :" + sum + "점");
		System.out.println("평균 :" + avg + "점");
	}
}
