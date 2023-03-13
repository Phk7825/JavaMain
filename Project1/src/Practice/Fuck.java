package Practice;

import java.util.Scanner;

public class Fuck {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("수를 입력해주세요  ");
			int a = sc.nextInt();
			System.out.print("이진수 변환 값:");
			for(int i = 2; i > 0 ; i*=2) {
				if(a>= i && a <(i*2))
				{
					System.out.print("1");
					a = a-i;
					if(a<(i/2)) {
						System.out.print("0");
					} 
					else {
						i /= 2 ;
					}
				}
					else if(a <= 1){
						System.out.print(a==1? "1":"0");
						break;
					}
			}	
		}
	}