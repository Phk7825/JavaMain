package day9;

import java.util.Scanner;

public class Q908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("부루마블을 시작하겠습니다.");
		
		int map[] = {1,2,3,4,5,6,7,8,9,10,11,12};			// 전체 맵 설정
		int player1map[] = new int[12];						// 플레이어 1 건물 가지고 있는 땅
		int player2map[] = new int[12];						// 플레이어 2 건물 가지고 있는 땅
		int c = 0 ;							//플레이어 1 건물 갯수
		int d = 0 ;							//플레이어 2 건물 개수
		
		
		int player1 = 1;					// 플레이어1 위치
		int player2 = 2;					// 플레이어2 위치
		
		int money[] = {4000,4000};			// 플레이어들 초기 금액 배열 생성
		
		System.out.println("1 2 3 4 5 6 7 8 9 A B C"); // 맵
		for (int i = 1 ; i >=1 ; i++) {					//main for문( 턴 바뀔때마다 알아서)
			System.out.println("주사위를 굴리세요");
			int button = sc.nextInt(); // 주사위 굴리기 버튼
			int a = (int) ((Math.random() * 6) + 1); // 다이스 1
			int b = (int) ((Math.random() * 6) + 1); // 다이스 2
			System.out.println("주사위가 " +a + " , "+ b + "가 나왔습니다.");
			System.out.println(a+b + "칸 이동");
			if(i%2==1) {								// player1
			player1 += (a+b);
			System.out.println("player1님이 " + player1 + "으로 이동하였습니다.");
			}else {										// player2
			player2 += (a+b);		
			System.out.println("player2님이 " + player2 + "으로 이동하였습니다.");
			}											// player2
			System.out.println("건물을 사시겠습니까?");
			System.out.println("1: 산다   2: 안 산다");
			int choice = sc.nextInt();				// 건물 구입 선택칸
			if(choice == 1) {
				System.out.println("1.별장 2.빌딩 3.호텔");
				int choice2 = sc.nextInt();			// 건물 종류 선택칸
				if(choice2 ==1) {
				money[(i+1)%2] -= map[a+b]*10;			//money[]의 순서는 player숫자의 순서와 달라지기에
				System.out.println("player"+((i+1)%2)+1+"님께서 별장을 구매하였습니다.");
				}
				else if(choice2 == 2) {
				money[(i+1)%2] -= map[a+b]*20;
				System.out.println("player"+((i+1)%2)+1+"님께서 빌딩을 구매하였습니다.");
				}
				else if(choice2 == 3) {
				money[(i+1)%2] -= map[a+b]*30;
				System.out.println("player"+((i+1)%2)+1+"님께서 호텔을 구매하였습니다.");
				}
				map[a+b] = (char)(50-i%2);				//49 = a , 50 = b
				System.out.println("player"+((i+1)%2)+1+"님의 남은 금액은 " + money[(i+1)%2]+ "입니다.");				
			}//choice == 1
			else {
				continue;
			}// choice == 2
			
			
			if((money[0] < 0 )||(money[1] < 0)) {
				System.out.println("player"+i%2+"님이 승리하셨습니다");
				break;
				} // 게임을 끝내는 if문
		}	//main for 문
	}		//main
}
