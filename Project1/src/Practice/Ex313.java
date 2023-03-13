package Practice;

public class Ex313 {
	public static void main(String[] args) {
		int i;
		int j;
		for(i=1 ; i <=6 ; i++) {
			for(j=1 ; j <=6 ; j++) {
			if(i + j == 6)
			{
				System.out.print(i + " ");
				System.out.println(j);
			}
			}
		}
	}
}
