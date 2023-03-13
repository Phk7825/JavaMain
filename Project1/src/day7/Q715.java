package day7;

import java.util.Scanner;

public class Q715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com = new String[] { "가위", "바위", "보" }[(int) (Math.random() * 3)];
		for (;;) {
			System.out.print("가위/바위/보 입력: ");
			String player = sc.next();
			System.out.println("--> 플레이어: " + player + "vs 컴: " + com);
			if ((player.equals("가위") && com.equals("가위")) || (player.equals("바위") && com.equals("바위"))
					|| (player.equals("보") && com.equals("보"))) {
				System.out.println("--> (비김)");
				break;
			} else if ((player.equals("가위") && com.equals("보")) || (player.equals("바위") && com.equals("가위"))
					|| (player.equals("보") && com.equals("바위"))) {
				System.out.println("--> 플레이어 승!");
				break;
			} else if ((player.equals("가위") && com.equals("바위")) || (player.equals("바위") && com.equals("보"))
					|| (player.equals("보") && com.equals("가위"))) {
				System.out.println("--> 플레이어 패!");
				break;
			} else
				continue;
		}
	}
}
