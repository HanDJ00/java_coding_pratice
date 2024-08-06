package baekjoon;

import java.util.Scanner;

public class _1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X_stick = sc.nextInt();
        int stick_num = 0;
        for (int i = 7; i > 0; i--){
            if((X_stick / recursion(i)) == 1){
                stick_num++;

            }
            X_stick %= recursion(i);
        }
        System.out.println(stick_num);



    }

    public static int recursion(int n){
        if(n == 1)
            return 1;
        else
            return 2 * recursion(n-1);
    }
}
