package day13;

import java.util.Arrays;

// Q1101. 연습(고급).
//  이 배열을 1~10 사이의 난수로 채우고,
//         1) (int)(Math.random()*10) +1
// 		   2) Random rd = new Random();
//            rd.nextInt(10) ------> 0~9
//            rd.nextInt(10)+1 ----> 1~10
// 이 배열이 오름차순/내림차순 여부를 판단. (난수발생 -> 중복 값 없도록)
// (실행결과) [4, 3, 7, 9]
//	 -> 오름차순X 내림차순X
// (실행결과) [1, 2, 7, 8]
//	 -> 오름차순O
// (실행결과) [8, 6, 4, 1]
// 	 -> 내림차순O
public class Q1101 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		boolean asc = true, desc = true;   // asc:오름차순이냐, desc:내~
			// 가정 : 오름차순임, 내림차순임.
		
		for(int i=0; i<=arr.length-2; i++) {  // i:0,1,2 (왼쪽)
			// arr[i] vs arr[i+1]
			if(arr[i] > arr[i+1]) {   // 왼>오 --> 오름차순 아님!
				asc = false;
			}
			if(arr[i] < arr[i+1]) {   // 왼<오 --> 내림차순 아님!
				desc = false;
			}
		}
		
		if(asc) { 
			System.out.println("오름차순O");
		} else if(desc) {
			System.out.println("내림차순O");
		} else {
			System.out.println("오름차순X 내림차순X");
		}
	}
}










