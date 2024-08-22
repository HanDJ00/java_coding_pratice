package baekjoon.diamond._5;

import java.util.Scanner;

public class _5051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {   // c 값 지정
            c = i;
            for (int j = 1; j < i; j++) {   // a 값 지정시 c 를 넘지 않도록 지정
                a = j;
                for (int k = j; k <= i; k++) {  // b값 지정 시 중복되지 않도록 a에서 부터 시작하며, c를 넘지 않도록 지정
                    b = k;
                    if (a * a + b * b == c * c) {   // a, b, c가 직각삼각형 조건을 만족하면 카운트
                        count++;
                    }
                }

            }

        }
        System.out.println(count);


    }
}
