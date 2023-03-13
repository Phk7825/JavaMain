package day6;

public class Ex608 {
	public static void main(String[] args) {
		for (int z = 0; z <= 2; z++) {	
			for (int i = 1; i <= 9; i++) { // *1 부터 *9까지
				for (int j = 1; j <= 3; j++) { // 2*1	3*1	   4*1 같이 3개씩만 출력되게
				int	x = (j + 1 + (z * 3));	// 앞의 숫자
					if(x<=9)
					System.out.print(x + " * " + i + " = " + x * i + "\t"); // 한줄에 3개만 나오게 출력
					if (j % 3 == 0 )	//*1,*2...이 끝나거나 앞이 9이면 한줄 띄도록
						System.out.println();
				}
			}
			System.out.println();
		}
	}
}