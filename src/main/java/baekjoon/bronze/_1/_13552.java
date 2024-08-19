package baekjoon.bronze._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _13552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();  // 결과를 모아서 한 번에 출력

        int n = Integer.parseInt(br.readLine()); // 점의 개수
        int[] x_dot = new int[n];
        int[] y_dot = new int[n];
        int[] z_dot = new int[n];

        // 점의 좌표 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_dot[i] = Integer.parseInt(st.nextToken());
            y_dot[i] = Integer.parseInt(st.nextToken());
            z_dot[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine()); // 원의 개수
        int[] x_circle = new int[m];
        int[] y_circle = new int[m];
        int[] z_circle = new int[m];
        int[] radius_circle = new int[m];

        // 원의 정보 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_circle[i] = Integer.parseInt(st.nextToken());
            y_circle[i] = Integer.parseInt(st.nextToken());
            z_circle[i] = Integer.parseInt(st.nextToken());
            radius_circle[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            int answer = 0;
            int x_c = x_circle[i];
            int y_c = y_circle[i];
            int z_c = z_circle[i];
            int radius = radius_circle[i] * radius_circle[i];

            for (int j = 0; j < n; j++) {
                int dx = x_c - x_dot[j];
                int dy = y_c - y_dot[j];
                int dz = z_c - z_dot[j];
                long distanceSquare = dx * dx + dy * dy + dz * dz;

                if (distanceSquare <= radius) {
                    answer++;
                }
            }
            sb.append(answer).append("\n");
        }


        System.out.print(sb.toString());
    }

}

