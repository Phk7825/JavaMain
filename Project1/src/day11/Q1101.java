package day11;

public class Q1101 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		boolean a = true;
		boolean b = true;
		System.out.print("[");
		for(int i = 0 ; i < 4 ; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			if(i == 3) { 
				System.out.print(arr[i]);
				break;}
			System.out.print(arr[i] + " , ");			
			for(int j = i+1; j <i+1 ; j++) {
				if(arr[j] < arr[i]) {
					b = false;
					a = true;
				}else if(arr[j] > arr[i]){
					a = false;
					b = true;
			}
	}
		}System.out.println("]");
		if(b = false) {
			System.out.println("내림차순");
		}else if(a = false) {
			System.out.println("올림차순");
		}else	{
			System.out.println("아무것도 아님");
		}
}
}
