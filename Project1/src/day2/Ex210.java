package day2;
// 삼항연산자 : 항이 3개인 연산자
//			[사용법]"조건식? true일때:false일때"
//			(ex) sysout(n%2==0?"짝수":"홀수");
public class Ex210 {
	public static void main(String[] args) {
		int num = 8;
		System.out.println(num%2==0? "짝수" : "홀수");
		
		char ch = (num%2==0? '짝':'홀');
		System.out.println(ch + "수");
	}
}
