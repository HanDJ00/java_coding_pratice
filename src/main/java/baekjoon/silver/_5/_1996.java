package baekjoon.silver._5;

import java.util.Scanner;

public class _1996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder[] map = new StringBuilder[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            map[i] = new StringBuilder(line);
        }

        char[][] answer_map = new char[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i].charAt(j) != '.'){
                    for(int k=i-1; k<i+1; k++) {
                        for(int l=j-1; l<j+1; l++) {
                            if(k >= 0 && j >= 0){
                                if(answer_map[k][l] != '*' && answer_map[k][l] != 'M'){
                                    map[]
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
