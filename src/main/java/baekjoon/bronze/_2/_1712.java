package baekjoon.bronze._2;

import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(c - b > 0){ // 손익 분기점 여부 체크
            System.out.println(a / (c - b) + 1); // 손익 분기점 계산
        }else System.out.println(-1); // 손익 분기점 없을시 -1 반환



    }
}
