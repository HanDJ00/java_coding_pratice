package baekjoon.bronze._3;

import java.math.BigInteger; // 수가 너무 커서 BigInteger를 사용
import java.util.Scanner;

public class _1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] sum = new BigInteger[3];

        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            sum[i] = BigInteger.ZERO; // biginteger로 설정
            for (int j = 0; j < n; j++) {
                sum[i] = sum[i].add(sc.nextBigInteger()); //각 수들 더해주기
            }
        }

        for (BigInteger s : sum) { // 부호 판별하여 출력
            int comparison = s.compareTo(BigInteger.ZERO);
            if (comparison > 0) {
                System.out.println("+");
            } else if (comparison < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}
