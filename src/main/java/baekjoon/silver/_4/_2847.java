package baekjoon.silver._4;

import java.util.Scanner;

public class _2847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int count = 0;  // 줄인 수 계산

        for (int i = n - 1; i > 0; i--) {   // 배열에 저장된 난이도의 맨 뒤에서 부터 시작
            if(scores[i] <= scores[i - 1]) {    // 만약 앞 난이도의 점수가 뒷 난이도의 점수보다 크거나 같다면
                // 앞 난이도의 점수를 뒷 난이도 보다 -1 만큼의 수치로 만들어 준다.
                count += scores[i - 1] - scores[i] + 1; // 앞 난이도의 점수와 뒷 난이도의 점수 차 + 1점을 count에 더해주어 줄인 수 계산
                scores[i - 1] = scores[i] - 1;  // 앞 난이도의 점수를 뒷 난이도보다 -1로 만들어주기
            }
        }

        System.out.println(count);
    }
}
