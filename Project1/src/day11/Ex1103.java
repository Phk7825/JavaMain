package day11;

public class Ex1103 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int a = 0;
		int b = 0;
		int[] num = new int[5];
		System.out.print("(");
		for(int i = 0 ; i < 5 ; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i] + ((i==4)? "" : " "));
			for(int j = 0; j <= i-1 ; j++) {
				if(arr[i] == arr[j]) {
					a++;
					num[i] = arr[i];
//					break;
				}
			}
		}System.out.print(")");
		System.out.println();
		if(a == 0)
			System.out.println("중복 없음");
		else {
		System.out.println("중복 있음");
		System.out.print(num[a] +"  ");
		}
//		System.out.println("홀수는 " + a +"개, 짝수는 " + b + "개");
	}
}
