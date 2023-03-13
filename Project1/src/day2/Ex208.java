package day2;
// 스캐너 객체 사용해서 정수 값 입력
// println()과 print()
import java.util.Scanner;

// 정수 값을 입력---->
public class Ex208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력: ");
		int num = sc.nextInt();
		System.out.println("입력 받은 값: " + num);
	}
}

