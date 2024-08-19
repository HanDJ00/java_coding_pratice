package baekjoon.bronze._3;

import java.util.Scanner;

public class _15953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int price_2017 = sc.nextInt();
            int price_2018 = sc.nextInt();
            int price = 0;
            if (price_2017 != 0) { // 2017년 상금 계산
                if (price_2017 <= 1) {
                    price += 5000000;
                } else if (price_2017 <= 3) {
                    price += 3000000;
                } else if (price_2017 <= 6) {
                    price += 2000000;
                } else if (price_2017 <= 10) {
                    price += 500000;
                } else if (price_2017 <= 15) {
                    price += 300000;
                } else if (price_2017 <= 21) {
                    price += 100000;
                }
            }

            if (price_2018 != 0) { // 2017 상금에 2018 상금 합산
                if (price_2018 <= 1) {
                    price += 5120000;
                } else if (price_2018 <= 3) {
                    price += 2560000;
                } else if (price_2018 <= 7) {
                    price += 1280000;
                } else if (price_2018 <= 15) {
                    price += 640000;
                } else if (price_2018 <= 31) {
                    price += 320000;
                }
            }
            System.out.println(price);

        }
    }
}
