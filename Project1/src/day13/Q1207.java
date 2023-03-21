package day13;

import java.util.Random;
import java.util.Scanner;

public class Q1207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		int[] arr = new int[5];
		for(;;) {
		for(int i = 0; i <= 4; i++) {
			arr[i] = rd.nextInt(10);
		}
		int correct = 0;
		int sum = 0;
		for(int i = 0; i <= 4 ; i++) {
			sum += arr[i];
			System.out.print(arr[i] + (i != 4? " + " : " ="));
		
		}
		int answer = sc.nextInt();
		if(sum == answer) {
			correct++;
			System.out.println("정답입니다.");
			continue;
		}else
			System.out.println("틀렸습니다. 총 " + correct + "문제를 맞추셨습니다.");
		break;
		}
	}
}
