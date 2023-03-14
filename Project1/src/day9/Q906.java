package day9;

import java.util.Scanner;

//(int) (Math.random() * 10) = 0,1,2,3,4,5,6,7,8,9
//(int) (Math.random() * 10)+1 = 1,2,3,4,5,6,7,8,9,10
//(실행결과)  Guess(1~100) :
public class Q906 {
	public static void main(String[] args) {
		int b = (int) ((Math.random() * 100)+1);
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.print("Guess : ");
		int a = sc.nextInt();
		if(a>b) {
			if(a-b >= 10) {
				System.out.println("훨씬 더 작은 수를 입력하세요.");
				cnt++;
				continue;
				}
			else {
				System.out.println("조금 더 작은 수를 입력하세요.");
				cnt++;
				continue;
				}
			}
		else if(a<b) {
			if(b-a >=10) {
				System.out.println("훨씬 더 큰 수를 입력하세요.");
				cnt++;
				continue;
				}
			else {
				System.out.println("조금 더 큰 수를 입력하세요.");
				cnt++;
				continue;
				}
			}else {
				System.out.println("맞췄음! " + cnt + "번의 시도 끝에 맞췄습니다.");
				break;
		}
		}
		}
	
}
