package day11;

public class Q1105 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = arr[0];
		int min = 9;
		int max1 = 0;
		
		for(int i = 0; i < 5 ; i++) {
			arr[i] = (int)(Math.random()*9+1);
			System.out.print(arr[i] + " ");
		}System.out.println();
			for(int j = 0 ; j<= 4 ; j++) {
			if(max < arr[j])
				max = arr[j];
			}
			for(int j = 4; j>=0  ; j--) {
			if(min > arr[j])
				min = arr[j];
			}
			for(int j = 0 ; j<= 4 ; j++) {
				if((max1 < arr[j]) && (max1 < max))
					max1 =arr[j];
			}
		System.out.println("max: " + max);
		System.out.println("max1: " + max1);
		System.out.println("min: " + min);
	}
}
