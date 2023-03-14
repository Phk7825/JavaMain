package day9;

import java.util.Scanner;

public class Q9033 {
    public static void main(String[] args) {
        int sum2 = 0;
        int sum[] = new int[100];
        int cnt = 0;
        int b = 0; 
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.print("홀수만 입력: ");
            int a = sc.nextInt();
            if (a % 2 == 1) {       
                if (a == b) { 
                    System.out.println("은 이미 입력하셨습니다. 다른 값을 입력해주세");
                } else {
                    sum[cnt] = a;
                    sum2 += a;
                    cnt++;
                    b = a; 
                }
            } else {
                System.out.println("짝수가 입력되었음! 끝!");
                System.out.print("지금까지 입력한 모든 홀수의 합: ");
                for (int i = 0; i < cnt; i++) {
                    if (i == cnt - 1) {
                        System.out.print(sum[i]);
                    } else {
                        System.out.print(sum[i] + "+");
                    }
                }
                System.out.println("= " + sum2);
                break;
            }
        }
    }
}