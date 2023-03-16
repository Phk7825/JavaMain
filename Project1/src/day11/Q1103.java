package day11;

public class Q1103 {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[6];
		for(int i = 0 ; i < 6 ; i ++) {
			arr[i] = (int)(Math.random()*10+1);
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("평균 : " + sum/6);
		System.out.print("평균보다 큰 요소: ");
		for(int j = 0 ; j < 6; j++) {
			if(arr[j] > sum/6) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
