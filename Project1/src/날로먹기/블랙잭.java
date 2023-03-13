package 날로먹기;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class 블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("블랙잭을 시작합니다.");

		ArrayList<String> deck = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			deck.add(String.valueOf(i));
		}
		deck.add("j");
		deck.add("q");
		deck.add("k");

		int sum = 0;
		int sum2 = 0;

		// 처음 카드 한장 뽑기
		String card = drawCard(deck);
		String card2 = drawCard(deck);
		sum = CardValue(card);
		sum2 = CardValue(card2);

		while (true) {
			System.out.println("--> 플레이어: " + sum + " vs 컴: " + sum2);
			System.out.print("카드 선택: 1, 카드 그만: 2 ");
			int a = sc.nextInt();
			if (a == 1) {
				String newCard = drawCard(deck);
				int cardValue = CardValue(newCard);
				sum += cardValue;
				String newCard2 = drawCard(deck);
				int cardValue2 = CardValue(newCard2);
				if (sum2 >= 17 && sum2 < 22) {
					sum2 += 0;
					System.out.println("플레이어 새로운 카드: " + newCard + ", 카드 값: " + cardValue);
				} else {
					sum2 += cardValue2;
					System.out.println("플레이어 새로운 카드: " + newCard + ", 카드 값: " + cardValue);
					System.out.println("컴퓨터 새로운 카드 : " + newCard2 + ", 카드 값: " + cardValue2);
				}
				if (sum > 21) {
					System.out.println("결과: 플레이어: " + sum + ", 컴퓨터: " + sum2);
					System.out.println("플레이어 탈락!");
					break;
				}
				if (sum2 > 21) {
					System.out.println("결과: 플레이어: " + sum + ", 컴퓨터: " + sum2);
					System.out.println("플레이어 win");
					break;
				}
				if ((sum==20 && sum2 == 20) || (sum ==21 && sum2 == 21) || (sum == 19 && sum2 ==19))
					System.out.println("무승부!!");
					}
			if (a == 2) {
				if(sum2>=10 && sum2<=18) {
					String newCard2 = drawCard(deck);
				    int cardValue2 = CardValue(newCard2);
				    sum2 += cardValue2;
				    }
				System.out.println("결과: 플레이어: " + sum + ", 컴퓨터: " + sum2);
				if ((sum > sum2 ) && (sum<22)) {
					System.out.println("플레이어 win");
				} else if ((sum < sum2) && (sum2 <22)) {
					System.out.println("컴퓨터 win");
				} else {
					System.out.println("무승부!");
				}
				break;
			}
		}
	}

	private static String drawCard(ArrayList<String> deck) {
		int randomIndex = (int) (Math.random() * deck.size());
		String card = deck.get(randomIndex);
		deck.remove(randomIndex);
		return card;
	}

	private static int CardValue(String card) {
		if (card.equals("1")) {
			System.out.print("A를 1로 하기: 1, A를 11로 하기: 2 ");
			Scanner sc = new Scanner(System.in);
			int b = sc.nextInt();
			return (b == 1) ? 1 : 11;
		} else if (card.equals("j") || card.equals("q") || card.equals("k")) {
			return 10;
		} else {
			return Integer.parseInt(card);
		}
	}
}