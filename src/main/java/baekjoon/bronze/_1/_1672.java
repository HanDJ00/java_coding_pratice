package baekjoon.bronze._1;

import java.util.Scanner;

public class _1672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 염기 서열의 길이
        sc.nextLine();
        String dna = sc.nextLine(); // 염기 서열
        char answer = dna.charAt(n-1);
        char clone = ' ';

        if(n != 1) { // 염기 서열의 길이가 1인 경우 루프를 수행 할 필요가 없음
            for (int i = n - 1; i > 0; i--) { // 염기 서열의 뒤에서 부터 루프를 수행
                clone = dna.charAt(i - 1);
                if (answer == clone) { // 만약 뒤의 두 염기가 같다면 두 염기는 한글자로 합쳐짐
                    answer = clone;
                } else if (answer == 'A') { // 염기 두개를 조합하여 하나로 만듬
                    switch (clone) {
                        case 'G':
                            answer = 'C';
                            break;
                        case 'C':
                            answer = 'A';
                            break;
                        case 'T':
                            answer = 'G';
                            break;
                    }
                } else if (answer == 'G') {
                    switch (clone) {
                        case 'A':
                            answer = 'C';
                            break;
                        case 'C':
                            answer = 'T';
                            break;
                        case 'T':
                            answer = 'A';
                            break;
                    }

                } else if (answer == 'C') {
                    switch (clone) {
                        case 'A':
                            answer = 'A';
                            break;
                        case 'G':
                            answer = 'T';
                            break;
                        case 'T':
                            answer = 'G';
                            break;
                    }

                } else if (answer == 'T') {
                    switch (clone) {
                        case 'A':
                            answer = 'G';
                            break;
                        case 'G':
                            answer = 'A';
                            break;
                        case 'C':
                            answer = 'G';
                            break;
                    }

                }
            }
        }
        System.out.println(answer);

    }
}
