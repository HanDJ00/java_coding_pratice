package baekjoon.silver._5;

import java.util.Scanner;

public class _31216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int token = 1;
        int super_count = 0;
        int i = 1;
        int super_decimal = 0;
        int super_index = 0;
        int super_token = 1;
        while (super_index != n) {
            while (true) {
                token = 1;
                ++i;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        token = 0;
                        break;
                    }
                }
                if (token == 1) {
                    super_decimal = i;
                    count++;
                    break;
                }
            }

            if (count != 1) {
                super_token = 1;
                for (int j = 2; j < count; j++) {
                    if (count % j == 0) {
                        super_token = 0;
                        break;
                    }
                }
                if (super_token == 1) {
                    super_count++;
                    if (arr[super_index] == super_count) {
                        System.out.println(super_decimal);
                        super_index++;
                    }
                }

            }


        }
    }
}

