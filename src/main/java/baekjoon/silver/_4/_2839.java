package baekjoon.silver._4;

import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            /* 3키로와 5키로 봉지로 가져갈 수 있는 최소 봉지 수 */
            int count = -1;
            for(int i = 0; i < 4; i++){
                if(n - i * 5 > 0){
                    if((n % 5 + i * 5) % 3 == 0){
                        count = (n - i * 5 )/ 5 + ((n % 5 + 5 * i) / 3);
                        break;
                    }
                }else break;

            }
            System.out.println(count);
    }
}
