package 날로먹기;


	import 날로먹기.Card;

	public class 심심심심심심심심심심 {
			public static void main(String[] args) {
				Card card1 = new Card();
				Card card2 = new Card();
				Card card3 = new Card();
				
				
				System.out.println(new Card().type);
				
				card1.type ="Diamond";
				card2.type ="Heart";
				System.out.println(card1.type);
				System.out.println(card2.type);
				System.out.println(card3.type);
				
				card1.width = 124;
				card2.height = 176;
				System.out.println(card1.width);
				System.out.println(card1.height);
				System.out.println(card2.width);
				System.out.println(card2.height);
				System.out.println(card3.width);
				System.out.println(card3.height);
				
				card3.type = "Clover";
				System.out.println(card1.type);
				System.out.println(card2.type);
				System.out.println(card3.type);
				
			}

	}


