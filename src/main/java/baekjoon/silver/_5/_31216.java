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
        int count = 0;  // 몇번째 소수 인지 체크
        int token = 1;  // 소수 인지 여부
        int super_count = 0;    // 몇번째 슈퍼 소수 인지 체크
        int i = 1;
        int super_decimal = 0;  // 슈퍼 소수의 숫자 가져오기
        int super_index = 0;    // 몇번째 슈퍼 소수 인지 인덱스를 통해 배열에 저장
        int super_token = 1;    // 슈퍼 소수인지 여부
        while (super_index != n) { // 슈퍼 소수를 모두 찾은게 아니라면
            while (true) {
                token = 1;
                ++i;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {   // 지금 숫자가 소수가 아닐 때
                        token = 0;  //  소수가 아니라고 표시
                        break;
                    }
                }
                if (token == 1) {   // 지금 숫자가 소수 일 때
                    super_decimal = i;  // 현재 숫자를 저장 해 두고
                    count++;    // 몇 번째 소수인지 체크하기 위해 카운트를 증가
                    break;
                }
            }

            if (count != 1) {   // 첫 번째 소수는 슈퍼 소수가 될수 없으므로 제외
                super_token = 1;
                for (int j = 2; j < count; j++) {
                    if (count % j == 0) {   // 지금 소수가 슈퍼 소수가 아닐 때
                        super_token = 0;    // 슈퍼 소수가 아니라고 표시
                        break;
                    }
                }
                if (super_token == 1) { // 지금 소수가 슈퍼 소수일 때
                    super_count++;  // 몇 번째 슈퍼 소수인지 체크하기 위해 카운트를 증가
                    if (arr[super_index] == super_count) {  // 찾는 n번째 슈퍼소수와 그 순서가 같다면
                        System.out.println(super_decimal);  // 그 숫자를 출력
                        super_index++;  // 이후 배열에 저장된 다음 n번재 슈퍼 소수를 찾기 위해 배열의 인덱스 증가
                    }
                }

            }


        }
    }
}

