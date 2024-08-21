package baekjoon.bronze._2;

import java.util.Scanner;

public class _3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9]; // 아홉 난쟁이의 숫자를 저장할 배열
        // 9개의 수를 더한 값에서 100을 뺀 값이 가짜 난쟁이 둘의 합과 같으면 가짜 난쟁이를 찾을 수 있음
        // 따라서 sum에는 미리 -100을 입력
        int sum = -100;
        for(int i = 0; i < 9; i++){
            sum += a[i] = sc.nextInt();
        }
        int index1 = 0; // 첫번째 가짜 난쟁이의 배열 인덱스 번호
        int index2 = 0; // 두번째 가짜 난쟁이의 배열 인덱스 번호
        int token = 0; // 루프를 빠져나가기 위한 토큰

        for(int i = 0; i < 9; i++){
            for(int j = i+1; j < 9; j++){
                // 특정 두 난쟁이의 번호의 합이 아홉 난쟁이의 번호의 합에서 -100을 뺀 값과 일치할 경우 그 둘은 가짜 난쟁이이다.
                if(a[i] + a[j] == sum){
                    index1 = i;  // 첫 번째 가짜 난쟁이의 배열 인덱스 번호 추출
                    index2 = j;  // 두 번째 가짜 난쟁이의 배열 인덱스 번호 추출
                    token = 1;   // 루프 탈출을 위한 토큰 활성화
                    break;
                }
            }
            if(token == 1) break;  // 토큰을 통한 루프 탈출
        }

        for(int i = 0; i < 9; i++){
            if(i != index1 && i != index2){  // 가짜 난쟁이를 제외한 진짜 난쟁이 출력
                System.out.println(a[i]);
            }
        }
    }
}
