package baekjoon.bronze._1;

import java.util.Scanner;

public class _2163 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        recursive(n,m);

        System.out.println(count);

    }

    public static void recursive(int n, int m) {
            // 재귀를 통하여 초콜릿의 크기가 1,1이 될 때 까지 쪼개는 함수
        if (n != 1 || m != 1) { // n과 m이 모두 1이면 최소값이므로 더이상 나눌 필요가 없음
           if (n >= m) { // n이 m보다 크거나 같으면
                if (n % 2 == 0) {   // n 이 짝수이면
                    count++;
                    recursive(n / 2, m);     // 두 조각은 균등하게 나누어짐
                    recursive(n / 2, m);
                } else {    // n이 홀수이면
                    count++;
                    recursive(n / 2, m);     // 두 조각은 균등하지 않고 한쪽이 +1인 상태가 되어야함
                    recursive(n / 2 + 1, m);
                }
            } else { // n이 m보다 작으면
                if (m % 2 == 0) {   // m 이 짝수이면
                    count++;
                    recursive(n, m / 2);    // 두 조각은 균등하게 나누어짐
                    recursive(n, m / 2);
                } else {    // m이 홀수이면
                    count++;
                    recursive(n, m / 2);    // 두 조각은 균등하지 않고 한쪽이 +1인 상태가 되어야함
                    recursive(n, m / 2 + 1);
                }
            }
        }
    }
}
