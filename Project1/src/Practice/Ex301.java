package Practice;

import java.util.Scanner;

//변수 의 값에 따라 num ‘ ’, ‘ ’, ‘0’ 양수 음수 을 출력하는 코드
public class Ex301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num<= 0? (num!=0? "음수":"0"):"양수");
	}
}
