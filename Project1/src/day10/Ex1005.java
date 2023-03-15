package day10;

import java.util.Arrays;

public class Ex1005 {
	public static void main(String[] args) {
		int[] arr;	// int 형 배열을 가리킬 변수 arr을 선언함.
		arr = new int[3];	// 크기가 3인 int형 배열을 생성해서 변수 arr과 연결함.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//출력 : Don't
		System.out.println(arr);	// (뒤에서 이해)
		
		//출력 1. Arrays.toString(배열이름)		[공부를 위해서 기억]
		System.out.println(Arrays.toString(arr));
		
		//출력 2. for문 : i에 인덱스.
		System.out.print("[");
		for(int i = 0; i <=2 ; i++) {
			if(i == 2)
				System.out.print(arr[i]);
			else
			System.out.print(arr[i] + ", ");
		}
		System.out.print("]");
		System.out.println();
		
		// 출력 3. '향상된 for문' ("for-each문")
		// "for(변수선언 : 집단) {...}"
		System.out.print("[");
		for (int element : arr) {
			if(element == 30)
			System.out.print(element + "]");
			else
				System.out.print(element + ", ");
		}
	}
}
