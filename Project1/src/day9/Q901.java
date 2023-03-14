package day9;

public class Q901 {
	public static void main(String[] args) {
		for(int i = 1 ; i <=100 ; i++) {
			if(!(i%10== 3 || i %10== 6 || i %10==9))
				continue;
			System.out.print(i + " ");
		}
	}
}
