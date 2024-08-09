package baekjoon.bronze._1;

import java.util.Scanner;

public class _1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int count = 0;
        int token = 1;
        int X_count = 0;
        int Y_count = 0;
        int X_arr = 0;
        int Y_arr = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'X') {
                    X_count = 1;
                }
            }
            if (X_count == 0) {
                X_arr++;

            }else  X_count = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 'X') {
                    Y_count = 1;
                }
            }
            if (Y_count == 0) {
                Y_arr++;

            }else Y_count = 0;
        }

        if(X_arr >= Y_arr){
            System.out.println(X_arr);
        } else {
            System.out.println(Y_arr);
        }

    }

}


