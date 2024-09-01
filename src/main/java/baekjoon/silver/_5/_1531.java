package baekjoon.silver._5;

import java.util.Scanner;

public class _1531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 좌표 개수 받아오기
        int m = sc.nextInt();   // 가려지는 종이 기준 갯수
        int[][] location = new int[n][4];   // 좌표 저장
        int[][] dots = new int[100][100];   // 점마다 가려진 종이 갯수
        int count = 0;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 4; j++) {
                location[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            // 좌표 내의 점들에 종이 붙이기
            for(int j = location[i][0]-1; j <= location[i][2]-1; j++) {
                for(int k = location[i][1]-1; k <= location[i][3]-1; k++) {
                    dots[j][k]++;
                }
            }
        }

        for(int j = 0; j < 100; j++) {
            // 점들의 종이 갯수 파악하여 보이는 부분 갯수 파악
            for(int k = 0; k < 100; k++) {
                if(dots[j][k] > m && dots[j][k] > 0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
