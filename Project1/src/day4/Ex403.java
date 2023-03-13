package day4;

public class Ex403 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 == c2);
		
		String s1 = "a";
		String s2 = "A";
//		System.out.println(s1 == s2);	// ...(X) 주의! 절대 이렇게 하지 마세요!
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
	}
}

