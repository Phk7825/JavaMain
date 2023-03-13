package day7;
//복습:구구단 한 줄에 3개의 단 씩 출력.

public class 복습 {
	public static void main(String[] args) {
		for (int i = 2; i <= 8; i += 3) {
			for (int j = 1; j <= 9; j++) {
				// i단 출력
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				// (i+1)단 출력
				System.out.print((i + 1) + " * " + j + " = " + ((i + 1) * j) + "\t");
				// (i+2)단 출력
				if (i + 2 < 10) {
					System.out.print((i + 2) + " * " + j + " = " + ((i + 2) * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
