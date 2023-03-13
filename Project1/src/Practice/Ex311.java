package Practice;
// 1+ (1+2) + (1+2+3) + ..... + (...+10)의 결과
public class Ex311 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1 ; i<=10 ; i++)
		{
			sum+= i * (11-i);
		}
		System.out.println(sum);
	}
}
