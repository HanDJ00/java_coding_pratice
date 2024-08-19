package baekjoon.bronze._3;

import java.util.Scanner;
import java.math.BigInteger; // 숫자가 너무 커서 BigInteger 사용


public class _2547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            int student = sc.nextInt();
            BigInteger candy = BigInteger.ZERO;
            for(int j = 1; j <= student; j++) {
                candy = candy.add(sc.nextBigInteger()); // 사탕 수 모두 더하기
            }
            if(candy.mod(BigInteger.valueOf(student)).equals(BigInteger.ZERO)){ // 학생수로 사탕수를 나눈 나머지에 따른 대답
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
