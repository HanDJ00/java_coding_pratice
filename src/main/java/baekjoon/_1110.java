package baekjoon;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int copy_n = n;

        // n이 한 자리일 경우 두 자리로 변환
        if (n < 10) {
            n = n * 10 + n;
            count++;
        }

        do {
            n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
            count++;
        } while (copy_n != n && n != 0);

        if(n == 0) count--; // n이 0일때 처리



        System.out.println(count);
    }
}

