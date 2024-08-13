package baekjoon.gold._1;

import java.util.Scanner;

public class _1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        int count = 0;

        for (long i = min; i <= max; i++) {

            for (long j = 2; j * j <= i; j++) {
                if ((i % (j * j) == 0)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(max - min - count + 1);
    }
}

