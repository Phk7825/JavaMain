package 날로먹기;

//(+고급화)0 이상 100이하의 정수를 입력하지 않은 경우 "0부터 100 사이의 값을 입력해주세요"라고 출력하고 다시 입력받으세요 제대로 입력할때까지
import java.util.Scanner;

public class 심심심심심심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i;
		for (i = 0; i < 2; i++) {
			int a = sc.nextInt();
			if (a <= 100 && a >= 0) {
				System.out.println("정수: " + a);
				break;
			} else {
				System.out.println("0부터 100 사이의 값을 입력해주세요");
				i = 0;
			}
		}
	}
}
