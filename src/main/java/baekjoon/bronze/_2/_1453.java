package baekjoon.bronze._2;

import java.util.Scanner;

public class _1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] client = new int[n];
        int[] count = new int[100];
        int counting = 0;
        for(int i = 0; i < n; i++){
            client[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            count[client[i]-1] = 1; // 중복 확인
        }

        for(int i = 0; i < 100; i++){
            if(count[i] == 1){ // 중복되지 않은 좌석 갯수 확인
                counting++;
            }
        }


        System.out.println(n-counting); // 전체 좌석에서 중복되지 않은 좌석 빼기
    }

}
