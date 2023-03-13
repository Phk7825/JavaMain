package day3;

// 상수 : 변수와 비슷한데, 두번 다시 값을 변경할 수 없다.
public class Ex306 {
	public static void main(String[] args) {
		final int num = 5;
//		num = 15;	//Error 상수니까 변경 불가
		System.out.println(num);
		
		final int num2;
		num2 = 5;
//		num2 = 15;	//Error 역시 상수니까
		System.out.println(num2);
	}
}
