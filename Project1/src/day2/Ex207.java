package day2;
// &&: 앰퍼샌드! ---> AND	 ||: 파이프! ----> OR
// [정리] AND:둘 다 true여야 true.
//		 OR:둘 중 하나라도 true이면 true.
public class Ex207 {
	public static void main(String[] args) {
		int a = 5;
		// 1) a가 5이거나 6이냐?
		System.out.println(a==5 || a==6);	// true
//		System.out.println(a==5 || 6);	// ERR. (이해)
		// 2) a가 5이거나 6이거나 7이냐?
		System.out.println(a==5 || a==6 || a==7);	//true
		
	}
}
