package baekjoon.silver._5;

import java.util.Scanner;

public class _1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int token = n.charAt(0) - '0'; // 0 과 1이 바뀌는 것을 체크하기 위한 토큰
        int count_0to1 = 0; // 0에서 1로 바뀐 횟수
        int count_1to0 = 0; // 1에서 0으로 바뀐 횟수
        int count = 0;

        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) - '0' != token) {
                if(token == 0){ // 0에서 1로 바뀐다면 카운트 체크
                    count_0to1++;
                    token = 1;
                }else{          // 1에서 0으로 바뀐다면 카운트 체크
                    count_1to0++;
                    token = 0;
                }
            }
        }

        // 문자열의 첫 글자와 마지막 글자가 같으면 count_0to1과 count1to0은 같은 숫자가 나온다.
        // 같지 않다면 더 많은 횟수로 변하는 count가 최소 변환이다.
        if(n.charAt(0) - '0' == n.charAt(n.length() - 1) - '0'){
            System.out.println(Math.min(count_0to1, count_1to0));   // 편의상 min으로 작성하였지만 둘 중 하나를 그냥 출력하여도 된다.
        } else  System.out.println(Math.max(count_0to1, count_1to0));
    }
}
