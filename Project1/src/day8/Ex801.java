package day8;

// break, continue 
public class Ex801 {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7
		for (int i = 1; i <= 7; i++) {
			if (i == 5)
				break;
			System.out.print(i + " ");
		}
		System.out.println();
		// 1 2 3 5 6 7
		for (int i = 1 ; i <= 7 ; i++) {
			if(i == 4)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 1;
		while(true) {
			if(i >7)
				break;
			if(i == 4)
				continue;
			System.out.print(i + " ");
			i++;
		}
	}
}
