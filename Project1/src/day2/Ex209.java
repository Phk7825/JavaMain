package day2;
// 증감연산자(++,--)
public class Ex209 {
	public static void main(String[] args) {
		int num = 5;
		num++;
		System.out.println(num);	// 6
		++num;
		System.out.println(num);	// 7
		
		int num2 = num++;	// int num2 = num; 이후 num++;
		System.out.println(num2);	// 7
		System.out.println(num);	// 8		
		int num3 = ++num;	// num++; 이후 int num3 = num;
		System.out.println(num3);	// 9
		System.out.println(num);	// 9
		
		int num4 = num--;	// num4 = 9
		System.out.println(--num4);	// 8
		System.out.println(num4);	// 8		
		System.out.println(num4--);	// 8
		System.out.println(num4);	// 7
		
	}
}

