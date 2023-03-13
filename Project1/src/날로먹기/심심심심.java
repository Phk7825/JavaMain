package 날로먹기;

import java.util.Scanner;

public class 심심심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int Sum = 0;
		int arr[] = new int[N];
		for(int i = 0; i <N ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a*b;
			Sum += arr[i];
		}
		if(Sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			}
		}
	}
