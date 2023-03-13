package day2;

// 자동 형 변환 규칙: b -> s -> i -> l -> f -> d
public class Ex202 {
	public static void main(String[] args) {
		//int n = 5.5;	//ERR
		double n2 = 5;
		// --> double n2 = 5.0; 으로 먼저 변환되어 실행됨!
	}
}
