import java.util.Arrays;

public class asd {
	public static void main(String[] args) {
		int a = 0;
		int[] arr = new int[25];		// 소수 담을 배열
		for(int i = 1; i <= 100 ; i++) {
		int cnt = 0;
			for(int j = 1 ; j <= i ; j++) {
				if(i % j == 0) {
				   cnt ++;
				}
			}	// for 문 j
			if(cnt == 2) {
				arr[a] = i;
				a++;
			}
		}	//for 문 i
		System.out.println(Arrays.toString(arr));
		}		//main 
}
