package Practice;

import java.util.Scanner;

public class 잡동사니 {
	public static void main(String[] args) {
		
		String id, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요: ");
		id = sc.nextLine();
		
		if(id.equals("Java")) {
			System.out.println("id 일치");
			System.out.println("비밀번호를 입력해주세요 :");
			password = sc.nextLine();
			if(password.contentEquals("adadad")) {
				System.out.println("password 일치!");
				System.out.println("로그인 성공!");
			}
			else
				System.out.println("password 불일치");
		}
		else
			System.out.println("id 불일치");
			}
	}
