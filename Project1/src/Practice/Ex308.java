package Practice;
//대문자를 소문자로 변경하는 코드인데 문자 에 저장된 문자가 대문자인 경우에만 소문자로 변경
public class Ex308 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch>='A'&& ch <='Z')?(char)(ch+32): ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
