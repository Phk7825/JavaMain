package Practice;

import java.util.Scanner;

public class Tetris {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int[][] field = new int[20][10];
		String[][] block1 = new String[1][4];
		String[][] block2 = new String[3][3];
		String[][] block3 = new String[3][3];
		String[][] block4 = new String[2][2];
		String[][] block5 = new String[3][3];
		String[][] block6 = new String[3][3];
		String[][] block7 = new String[3][3];
		System.out.println("테트리스를 시작합니다.");
			block1[0][0] = "*";
			block1[0][1] = "*";
			block1[0][2] = "*";
			block1[0][3] = "*";
			
			block2[0][0] = " ";
			block2[0][1] = " ";
			block2[0][2] = " ";
			block2[1][0] = "*";
			block2[1][1] = " ";
			block2[1][2] = " ";
			block2[2][0] = "*";
			block2[2][1] = "*";
			block2[2][2] = "*";
			
			block3[0][0] = " ";
			block3[0][1] = " ";
			block3[0][2] = " ";
			block3[1][0] = " ";
			block3[1][1] = " ";
			block3[1][2] = "*";
			block3[2][0] = "*";
			block3[2][1] = "*";
			block3[2][2] = "*";
			
			block4[0][0] = "*";
			block4[0][1] = "*";
			block4[1][0] = "*";
			block4[1][1] = "*";
			
			block5[0][0] = " ";
			block5[0][1] = " ";
			block5[0][2] = " ";
			block5[1][0] = " ";
			block5[1][1] = "*";
			block5[1][2] = "*";
			block5[2][0] = "*";
			block5[2][1] = "*";
			block5[2][2] = " ";
			
			block6[0][0] = " ";
			block6[0][1] = " ";
			block6[0][2] = " ";
			block6[1][0] = " ";
			block6[1][1] = "*";
			block6[1][2] = " ";
			block6[2][0] = "*";
			block6[2][1] = "*";
			block6[2][2] = "*";
		
			block7[0][0] = " ";
			block7[0][1] = " ";
			block7[0][2] = " ";
			block7[1][0] = "*";
			block7[1][1] = "*";
			block7[1][2] = " ";
			block7[2][0] = " ";
			block7[2][1] = "*";
			block7[2][2] = "*";
				
			for (;;) {
				int block = (int)(Math.random()*7)+1;
				if(block == 1) {
					for (int i = 0; i < 4; i++) {
						System.out.print(block1[0][i] + " ");
					}
					System.out.println();
				}
				else if(block == 2) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(block2[i][j] + " ");
						}
						System.out.println();
					}	
				}
				else if(block == 3) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(block3[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if(block == 4) {
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							System.out.print(block4[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if(block == 5) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(block5[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if(block == 6) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(block6[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if(block == 7) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(block7[i][j] + " ");
						}
						System.out.println();
					}	
				}
				System.out.println("블럭을 선택한다 : 1 ");
				System.out.println("블럭을 돌린다 : 2 ");
				int a = sc.nextInt();								//블럭 선택 관련 입력문
				if(a == 1) {
					System.out.println("넣을 위치를 선택하세요");
					int b = sc.nextInt();							// 1~10까지 선택
//					field[][] = 
				}
				if(a == 2) {
					break;
				}
			}						//게임 반복문
	}			// main
}
