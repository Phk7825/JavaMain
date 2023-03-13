package day7;

// break, continue
public class Ex702 {
	public static void main(String[] args) {
		// break문
		for(int i = 1; i >= 1; i++) {
			// break문: 반복문 밖으로 빠져나옴. (주의 : 하나만 빠져나옴)
			if(i == 5)
				break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		// continue 문: 위로 올라가서 계속함(다음 반복회차부터 계속)
		for(int i = 1; i <= 7; i++) {
			if(i == 4) {
				System.out.print("a ");
				continue;					//4의 값은 빠짐
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}