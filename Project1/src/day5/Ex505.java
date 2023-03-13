package day5;

public class Ex505 {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:		// num이 1일때.
			System.out.println("하나");
//			break;	// switch 문을 탈출 , 없으면 1 눌렀을때 하나 둘 셋 다 출력된다. 
		case 2:		// num이 2일때.
			System.out.println("둘");
//			break;
		case 3:		// num이 3일때.
			System.out.println("셋");
			break;
		default:	// 위의 경우 빼고 모두 다
			System.out.println("그 밖의 값...");
		}
	}
}
