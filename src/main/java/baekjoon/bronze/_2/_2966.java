package baekjoon.bronze._2;

import java.util.Scanner;

public class _2966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        // 세사람은 각각 3배수, 2배수, 4배수의 주기를 가지고 답을 반복하기 때문에 셋의 최소공배수인 12주기를 가지도록 배열에 저장하여 사용한다.
        char[] Adrian = {'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'C'};
        char[] Bruno = {'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C', 'B', 'A', 'B', 'C'};
        char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B', 'C', 'C', 'A', 'A', 'B', 'B'};

        int score_adrian = 0;
        int score_bruno = 0;
        int score_goran = 0;

        for (int i = 0; i < n; i++) { // 반복문을 통해 입력된 답과 비교하여 점수를 체크한다.
            if (s.charAt(i) == Adrian[i % 12]) score_adrian++;
            if (s.charAt(i) == Bruno[i % 12]) score_bruno++;
            if (s.charAt(i) == Goran[i % 12]) score_goran++;
        }

        // 셋중 최고점을 뽑아낸다.
        int max_score = Math.max(score_adrian, Math.max(score_bruno, score_goran));
        System.out.println(max_score);

        // 셋중 하나는 최고점이기 때문에 반드시 한명은 출력되며, 최고점이 여러명인 경우 해당하는 여러명이 출력된다.
        if (score_adrian == max_score) System.out.println("Adrian");
        if (score_bruno == max_score) System.out.println("Bruno");
        if (score_goran == max_score) System.out.println("Goran");

    }
}
