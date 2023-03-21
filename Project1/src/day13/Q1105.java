package day13;

import java.util.Arrays;

//Q1105.	연습. 크기가 5인 int형 배열을 난수 발생(1~9)해서 채우고,
//(중복된 값이 없다고 가정):고급.
//1) 배열 전체의 내용을 출력.
//2) (배열 요소들 중) 최대 값(,최소 값)을 출력.  
//------------------------------------ 여기까지 '기본'
//3) (고급) 두 번째로 큰 수 출력.
public class Q1105 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*9) + 1;   // 1~9
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];  // max : 최대 값이라고 가정하고 있는 수.
		int idx = 0;  // idx : 최대 값이라고 가정하고 있는 수의 위치(인덱스).
		for(int i=1; i<=arr.length-1; i++) {
			// max < arr[i] ------> max = arr[i];
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println("최대 값 : " + max);
		arr[idx] = 0;   // 두 번째로 큰 값을 구하기 위해서...
		
		max = arr[0];  // max : 최대 값이라고 가정하고 있는 수.
		for(int i=1; i<=arr.length-1; i++) {
			// max < arr[i] ------> max = arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("두 번째 큰 값 : " + max);
	}
}









