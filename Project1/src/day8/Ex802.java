package day8;

import java.util.Scanner;

public class Ex802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com = new String[] { "가위", "바위", "보" }[(int) (Math.random() * 3)];
			System.out.print("가위/바위/보 입력: ");
			String player = sc.next();
//			while(!(player.equals("가위")) && !(player.equals("바위")) && !(player.equals("보"))) {
//			System.out.print("잘못 입력하셨습니다. 가위/바위/보 입력: ");
//			player = sc.next();}
			while(true) {
				if((player.equals("가위")) || (player.equals("바위")) || (player.equals("보")))
					break;
			System.out.print("잘못 입력하셨습니다. 가위/바위/보 입력: ");
			player = sc.next();
			}
			System.out.println("--> 플레이어: " + player + " vs 컴: " + com);
			if ((player.equals("가위") && com.equals("가위")) || (player.equals("바위") && com.equals("바위"))
					|| (player.equals("보") && com.equals("보"))) {
				System.out.println("--> (비김)");
			} else if ((player.equals("가위") && com.equals("보")) || (player.equals("바위") && com.equals("가위"))
					|| (player.equals("보") && com.equals("바위"))) {
				System.out.println("--> 플레이어 승!");
			} else if ((player.equals("가위") && com.equals("바위")) || (player.equals("바위") && com.equals("보"))
					|| (player.equals("보") && com.equals("가위"))) {
				System.out.println("--> 플레이어 패!");
			}
		}
	}


