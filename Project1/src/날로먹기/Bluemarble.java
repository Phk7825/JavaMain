package 날로먹기;

import java.util.Scanner;

public class Bluemarble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("부루마블을 시작하겠습니다.");

		int playerValue[] = { 65, 66 }; // 플레이어 땅 표시
		int map[] = { 0, 1, 2, 3, 4, 5, 6, 7, 4444, 9, 10, 11, 1212, 13, 14, 15 }; // 보이는 맵 설정
		int map2[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // 실제 맵 숫자 설정
//		String map3[] = {"가","나","다","라","마","바","사","아","무인도","자","차","카","세계여행","타","파","하"};
		int c = 0; // 플레이어 1 건물 갯수
		int d = 0; // 플레이어 2 건물 개수
		
		int cnt = 0;

		int player1 = 0; // 플레이어1 위치
		int player2 = 0; // 플레이어2 위치

		int money[] = { 10000 , 10000 }; // 플레이어들 초기 금액 배열 생성
		// 시작점
		for (int i = 1; i >= 1; i++) { // main for문( 턴 바뀔때마다 알아서)
			
				for (int w = 0; w <= 4; w++) {
//					System.out.print(map3[w] + "\t");
					System.out.print(map[w] + "\t");
				}
				System.out.println();
				System.out.println();
				System.out.println();
					for(int w = 15 ; w >=13 ; w--) {
//						System.out.println(map3[w] + "\t\t\t\t" + map3[(20-w)]);
						System.out.println(map[w] + "\t\t\t\t" + map[(20-w)]);
						System.out.println();
						System.out.println();
					}
				for(int l = 12; l >= 8 ; l--) {
//					System.out.print(map3[l] + "\t");
					System.out.print(map[l] + "\t");
				}
			System.out.println();
			System.out.println("Player1의 위치는" +map2[player1] + "입니다.");
//			System.out.println("Player1의 위치는" +map3[player1] + "입니다.");
			System.out.println("Player2의 위치는" +map2[player2] + "입니다.");
//			System.out.println("Player2의 위치는" +map3[player2] + "입니다.");
			System.out.println("Player" + (2 - i % 2) + "차례입니다.");
			System.out.println("주사위를 굴리세요");
			int button = sc.nextInt(); // 주사위 굴리기 버튼
			int a = (int) ((Math.random() * 5) + 1); // 다이스 1 : 1 ~ 5
			int b = (int) ((Math.random() * 5) + 1); // 다이스 2 : 1 ~ 5
			int sum = a + b;
			if (a == b)
				System.out.println("더블입니다.");

			System.out.println("주사위가 " + a + " , " + b + "가 나왔습니다.");
			System.out.println(sum + "칸 이동");
			if (i % 2 == 1) { // player1
				player1 += sum;
				if (player1 > 15) {
					player1 -= 16;
					sum = player1;
					money[0] += 3000;
					System.out.println("player1님의 금액은 " + money[0] + "입니다.");
					System.out.println("player1님이 " + player1 + "으로 이동하였습니다.");
//					System.out.println("player1님이 " + map3[player1] + "으로 이동하였습니다.");
				} else {
					System.out.println("player1님이 " + player1 + "으로 이동하였습니다.");
//					System.out.println("player1님이 " + map3[player1] + "으로 이동하였습니다.");
				} if (map[player1] == 85 || map[player1] ==75 || map[player1] == 65) { // 내 땅일때
					System.out.println("자기 건물입니다.");
					continue;
				}
				// 세계여행
				if(map2[player1] == map2[12]) {
					System.out.println("세계여행 입니다. 원하는 곳을 선택하세요");
					int e = sc.nextInt();
					player1 = e;
					if(player1 >= e){
						money[0] +=3000;
						System.out.println("player1님의 금액은 " + money[0] + "입니다.");
					}
					System.out.println(player1 +"에 도착하셨습니다");
//					System.out.println(map3[player1] +"에 도착하셨습니다");
				}		
				// 건물 걸릴때
				if (map[player1] == 86 || map[player1] ==76 || map[player1] == 66) {
//					if (map3[player1] == "별장2" || map3[player1] =="빌딩2" || map3[player1] == "호텔2") {
					System.out.println("Player2님의 건물에 들어오셨습니다.");
					money[0] -= d * 200;
					money[1] += d * 200;
					System.out.println("Player2님의 금액은 " + money[1] + "입니다.");
					System.out.println("Player1님의 금액은 " + money[0] + "입니다.");
					continue;
				}
				// 무인도
				if(map2[player1] == map2[8]){
					System.out.println("무인도 데스요!");
					a = (int) ((Math.random() * 6) + 1); // 다이스 1
					b = (int) ((Math.random() * 6) + 1); // 다이스 2
					System.out.println("주사위가 " + a + " , " + b + "가 나왔습니다.");
					if(a == b) {
						System.out.println("탈출 하였습니다");
					} else {
						System.out.println("탈출 못합니다");
						i+=2;
						continue;
					}
				}		//무인도 끝
				
			} 		// player1
			else { // player2
				player2 += sum;
				if (player2 > 15) {
					player2 -= 16;
					sum = player2;
					money[1] += 3000;
					System.out.println("player2님의 금액은 " + money[1] + "입니다.");
					System.out.println("player2님이 " + player2 + "으로 이동하였습니다.");
//					System.out.println("player2님이 " + map3[player2] + "으로 이동하였습니다.");
				} else {
					System.out.println("player2님이 " + player2 + "으로 이동하였습니다.");
//					System.out.println("player2님이 " + map3[player2] + "으로 이동하였습니다.");
				}if (map[player2] == 86 || map[player2] ==76 || map[player2] == 66) { // 내 땅일때
					System.out.println("자기 건물입니다.");
					continue;
				}
				// 세계여행
				if(map2[player2] == map2[12]) {
					System.out.println("세계여행 입니다. 원하는 곳을 선택하세요");
					int e = sc.nextInt();
					player2 = e;
					if(player2 >= e){
						money[1] +=3000;
						System.out.println("player2님의 금액은 " + money[1] + "입니다.");
					}
					System.out.println(player2 +"에 도착하셨습니다");
				}		//세계여행 끝
				// 건물 걸릴때
				if (map[player2] == 85 || map[player2] ==75 || map[player2] == 65) {
//					if (map3[player2] == "별장1" || map3[player2] =="빌딩1" || map3[player2] == "호텔1") {
					System.out.println("Player1님의 건물에 들어오셨습니다.");
					money[0] += c * 200;
					money[1] -= c * 200;
					System.out.println("Player2님의 금액은 " + money[1] + "입니다.");
					System.out.println("Player1님의 금액은 " + money[0] + "입니다.");
					continue;
				}
				// 무인도
				if(map2[player2] == map2[8]){
					System.out.println("무인도 데스요!");
					a = (int) ((Math.random() * 6) + 1); // 다이스 1
					b = (int) ((Math.random() * 6) + 1); // 다이스 2
					System.out.println("주사위가 " + a + " , " + b + "가 나왔습니다.");
					if(a == b) {
						System.out.println("탈출 하였습니다");
					} else {
						System.out.println("탈출 못합니다");
						i+=2;
						continue;
					}
				}		//무인도 끝
			} // player2

				System.out.println("건물을 사시겠습니까?");
				System.out.println("1: 산다   2: 안 산다");
				int choice = sc.nextInt(); // 건물 구입 선택칸
				if (choice == 1) {
					System.out.println("1.별장 2.빌딩 3.호텔");
					int choice2 = sc.nextInt(); // 건물 종류 선택칸
					if (choice2 == 1) {
						money[(i + 1) % 2] -= map2[sum] * 100; // money[]의 순서는 player숫자의 순서와 달라지기에
						if (i % 2 == 1)
							c += 1 * map2[sum];
						else
							d += 1 * map2[sum];
						System.out.println("player" + (((i + 1) % 2) + 1) + "님께서 별장을 구매하였습니다.");
						if(i%2==1) {
							System.out.println(map2[player1] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player1] = (66 - i % 2);
//						map3[player1] = "별장1";
						}else {
							System.out.println(map2[player2] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player2] = (66 - i % 2);
//						map3[player2] = "별장2";
						}
					} else if (choice2 == 2) {
						money[(i + 1) % 2] -= map2[sum] * 200;
						if (i % 2 == 1)
							c += 2 * map2[sum];
						else
							d += 2 * map2[sum];
						System.out.println("player" + ((int) ((i + 1) % 2) + 1) + "님께서 빌딩을 구매하였습니다.");
						if(i%2==1) {
							System.out.println(map2[player1] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player1] = (76 - i % 2);
//						map3[player1] = "빌딩1";
						}else {
							System.out.println(map2[player2] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player2] = (76 - i % 2);
//						map3[player2] = "빌딩2";
						}
					} else if (choice2 == 3) {
						money[(i + 1) % 2] -= map2[sum] * 300;
						if (i % 2 == 1)
							c += 3 * map2[sum];
						else
							d += 3 * map2[sum];
//						System.out.println(c + " , " + d);
						System.out.println("player" + ((int) ((i + 1) % 2) + 1) + "님께서 호텔을 구매하였습니다.");
						if(i%2==1) {
							System.out.println(map2[player1] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player1] = (86 - i % 2);
//						map3[player1] = "호텔1";
						}else {
							System.out.println(map2[player2] + "의 주인은  Player" + (((i + 1) % 2) + 1) + " 입니다");
						map[player2] = (86 - i % 2);
//						map3[player2] = "호텔2";
						}
					}
				} // choice == 1
				else {
					continue;
				} // choice == 2
			System.out.println("player" + ((int) ((i + 1) % 2) + 1) + "님의 남은 금액은 " + money[(i + 1) % 2] + "입니다.");
			System.out.println();
			if (a == b)				// 더블일때
				i--;
			if ((money[0] < 0) || (money[1] < 0)) {
				System.out.println("player" + (2 - ((i + 1) % 2)) + "님이 승리하셨습니다");
				break;
			} // 게임을 끝내는 if문
		} // main for 문
	} // main
}