package day11;

import java.util.Arrays;
import java.util.Random;

public class Ex1101 {
	public static void main(String[] args) {
		Random rd = new Random();	// 방법 2
		int [] arr = new int[10];
		for(int i = 0 ; i <10 ; i++) {
//			arr[i] = (int)(Math.random()*6+1);		// 방법 1
			arr[i] = rd.nextInt(6) + 1;				// 방법 2
		}
		System.out.print(Arrays.toString(arr));
	}
}
