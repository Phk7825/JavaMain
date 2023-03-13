package 날로먹기;

import java.util.Scanner;

//동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 
//흰색 피스는 개수가 올바르지 않았다.
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
public class 심심심심심심심심심 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
//		System.out.println(a.charAt(2));
		char arr[] = { '1', '1', '2', '2', '2', '8' };
//		System.out.println(arr[2]);
		for (int i = 1; i <= 6; i++) {
//			arr[i - 1] = a.charAt(i * 2 - 2);
			if (arr[i - 1] != a.charAt(i * 2 - 2)) {
				arr[i - 1] = (char) (arr[i-1] -a.charAt(i * 2 - 2)+48);
//				if(arr[i-1]< 0) {
//					arr[i-1] =  (char) ('-'+((char)(arr[i-1]+(char)70)));
//				}
			} else {
				arr[i - 1] = '0';
			}
		}
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]+" "+arr[5]);
	}
}
