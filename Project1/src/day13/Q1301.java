package day13;


public class Q1301 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[45];
		for (int i = 1; i <= 6; i++) {
			int a = (int) (Math.random() * 45);
			if(arr[a]) {
				i--;
				continue;
			}
			arr[a] = true;
		}
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i <= 44; i++) {
			if(arr[i] == true) {						// == true는 굳이......
				System.out.print((i+1) + " ");
			}
		}
	}
}
