package Practice;

import java.util.Scanner;

public class Ex318 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfApples = sc.nextInt();
		int sizeOfBucket = 10;
		
		int numOfBucket = ((numOfApples/sizeOfBucket)+ (numOfApples%10==0? 0:1));
		
		System.out.println("필요한 바구니의 수:" +numOfBucket);
	}
}
