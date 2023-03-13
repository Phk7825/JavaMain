package Practice;

public class Ex307 {
	public static void main(String[] args) {
			char ch = '+';
			boolean b = ((ch <= 'z'&& ch >='a')||(ch>='0'&& ch<='9')||(ch <='Z'&& ch >='A'));
			System.out.println(b);
	}
}
