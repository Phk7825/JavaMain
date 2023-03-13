package day7;
// [최고급] PI를 계산	1/1 - 1/3 + 1/5 - 1/7 + 1/9..... = PI/4
	// 소수점 6번째 자리 까지 확정되었을때까지 반복
	// (출력)몇번째 항까지 더했는지?
	//		그래서 그때까지 계산된 값이 얼마인지?
//			3.141592.....		//double 타입으로
public class Q703 {
	public static void main(String[] args) {
		double PI = 0;
		double realPI = 3141592;
		int a = 1;	//-1을 곱하기
		for(int i = 0; i >=0 ; i++) {
			PI += (a*1.0/(2*i+1)*4);
			a *= -1;
			System.out.println(PI);
			if(((int)(PI*1000000) == realPI)) {
				System.out.println(i+1 +"번째 항까지" );
				System.out.println("PI값은: " + PI);
			break;
			}
		}
	}
}
