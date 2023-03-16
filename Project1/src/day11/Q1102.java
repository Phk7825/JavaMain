package day11;

import java.util.Scanner;

public class Q1102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." };
		for (;;) {
			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("예약하시겠습니까?");
			String a = sc.next();
			char b = a.charAt(0);
			if (b == 'y') {
				for(;;) {
				System.out.print("예약할 좌석 번호 입력: ");
				int c = sc.nextInt();
				if(arr[c-1] == "X") {
					System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요.");
					continue;
				}
				System.out.println("예약되었습니다.");
				arr[c-1] = "X";
				break;
			}
		}
	}
}
}