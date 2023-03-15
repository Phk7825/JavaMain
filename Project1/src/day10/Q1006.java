package day10;

public class Q1006 {
	public static void main(String[] args) {
		String[] arr;		//문자열 배열을 가리킬 변수를 선언.
		arr = new String[3];	// 배열 생성 - 변수 연결.
		arr[0] = "이하늘";
		arr[1] = "정택인";
		arr[2] = "박형근";
		System.out.print("[");
		for(int i = 0; i <= 2; i++) {
			if(i == 2)
				System.out.println(arr[i] + "]");
			else
			System.out.print(arr[i]+ " , ");
		}
		System.out.println();
		}
}
