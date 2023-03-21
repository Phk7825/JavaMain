package day14;

import java.util.Arrays;

public class Rhombus {
	public static void main(String[] args) {
		String[][] arr = {
				{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}
		};
		for(int i = 0 ; i < 3 ; i++ ) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		String[][] arr2 = {
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "},
			{" "," "," "," "," "}
		};
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j ++) {
				arr2[0][2] = arr[0][0];
				if(i + j == 1 && i <3) 
					arr2[1][j*2+1] = arr[i][j];
				else if(i + j ==2 && i < 3) 
					arr2[2][j*2] = arr[i][j];
				else if(i + j == 3 && i < 3 && i >0 && j < 3)
					arr2[3][j*2-1] = arr[i][j];
				else if(i + j == 4 && i < 3 && i >0 && j < 3)
					arr2[4][2] = arr[i][j];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
