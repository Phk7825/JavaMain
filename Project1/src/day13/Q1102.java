package day13;

import java.util.Scanner;

/*
Q1102. 연습(고급).
	--------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . . . . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? y (엔터)
	예약할 좌석 번호 입력: 7 (엔터)
	예약되었습니다.

	--------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . . X . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? y (엔터)
	예약할 좌석 번호 입력: 7 (엔터)
	이미 예약된 좌석입니다. 다시 입력해주세요.
	예약할 좌석 번호 입력: 6 (엔터)
	예약되었습니다.

	--------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . X X . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? n (엔터)
	끝. 
*/
public class Q1102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arrReserve = new boolean[10];   // (cf) int[] arr = new int[10];
		while(true) {
			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<=arrReserve.length-1; i++) {
				if(arrReserve[i]) 
					System.out.print("X ");  // 이미 예약된. (예약불가능)
				else 
					System.out.print(". ");  // 예약 안 된. (예약가능)
			}
			System.out.println("\n--------------------");
	
			System.out.print("예약하시겠습니까? ");
			String s = sc.next();
			if(s.equals("n")) {
				System.out.println("끝.");
				break; 
			} else if(s.equals("y")) {
				while(true) {
					System.out.print("예약할 좌석 번호 입력: ");
					int seatNumber = sc.nextInt();
					if(!arrReserve[seatNumber-1]) {
						arrReserve[seatNumber-1] = true;
						System.out.println("예약되었습니다.");
						break;
					}
					System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요.");
				}
			}
		}
	}
}










