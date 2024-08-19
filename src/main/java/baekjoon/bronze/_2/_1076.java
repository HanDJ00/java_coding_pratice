package baekjoon.bronze._2;

import java.util.Scanner;

public class _1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            str[i] = sc.nextLine();
        }


        for (int i = 0; i < str.length; i++) { // 각각의 색에 따른 저항 입력
            switch (str[i]) {
                case "black":
                    arr[i] = 0;
                    break;
                case "brown":
                    arr[i] = 1;
                    break;
                case "red":
                    arr[i] = 2;
                    break;
                case "orange":
                    arr[i] = 3;
                    break;
                case "yellow":
                    arr[i] = 4;
                    break;
                case "green":
                    arr[i] = 5;
                    break;
                case "blue":
                    arr[i] = 6;
                    break;
                case "violet":
                    arr[i] = 7;
                    break;
                case "grey":
                    arr[i] = 8;
                    break;
                case "white":
                    arr[i] = 9;
                    break;
                default:
                    break;
            }
        }
        //첫자리는 10의자리, 둘쨰자리는 1의자리의 두자리수 정수를 만든 후 세번째 색을 곱해줌
        long Resistance =  ((arr[0] * 10 + arr[1]) * (long)Math.pow(10, arr[2]));

        System.out.println(Resistance);

    }
}
