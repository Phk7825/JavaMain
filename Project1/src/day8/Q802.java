package day8;

public class Q802 {
	public static void main(String[] args) {
		int i = 1;
		for(;;) {
			i++;
			if(i == 100)
				break;
			if(i%3!=0)
				continue;
			System.out.print(i + " ");
		}
	}
}
