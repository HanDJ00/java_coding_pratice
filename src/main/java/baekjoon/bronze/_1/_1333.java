package baekjoon.bronze._1;

import java.util.Scanner;

public class _1333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 노래의 개수
        int l = sc.nextInt();  // 노래의 길이
        int d = sc.nextInt();  // 벨소리 간격
        int answer = 0;

        for (int t = 1; t <= n; t++) { // 최대 노래의 갯수까지 반복 시작
            int songEnd = l * t + 5 * (t - 1); // 노래가 끝나는 시점

            while (answer < songEnd) { // 벨이 울리는 시점이 노래가 끝나는 시점보다 작으면
                answer += d; // 벨소리를 한번 더 울림
            }

            if (answer >= songEnd && answer < songEnd + 5) {
                break;  // 벨소리가 음악이 끝나고 5초 안에 울리면 종료
            }
        }

        System.out.println(answer);
    }
}
