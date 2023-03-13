package day6;

public class Ex601 {
	public static void main(String[] args) {
		System.out.println(4>3? 1 : 1.0);	// 1.0으로 무조건 출력됌 -> 1과 1.0의 데이터 타입을 일치시키려 하기 때문
		
		System.out.println(4>3? 1+"" : 1.0+"");	//1로 출력됌
	}
}
