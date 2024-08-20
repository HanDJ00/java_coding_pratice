package baekjoon.platinum._5;

import java.math.BigInteger;
import java.util.Scanner;

public class _1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int f = sc.nextInt();
        int m = sc.nextInt();



        int index = -1;
        BigInteger com = BigInteger.ONE;


        for (int i = s + f; i > s; i--) {
            com = com.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= f; i++) {
            com = com.divide(BigInteger.valueOf(i));
        }

        System.out.println(com);

        for (int i = m; i >= 1; i--) {
            if (com.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                index = i;
                break;
            }
        }

            System.out.println(index);

    }
}
