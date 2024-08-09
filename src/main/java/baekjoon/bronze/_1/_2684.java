package baekjoon.bronze._1;

import java.util.Scanner;

public class _2684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        sc.nextLine();
        String[] string = new String[num];
        for(int i = 0; i < num; i++){
            string[i] = sc.nextLine();
        }



        for(int i = 0 ; i < num ; i++){
            int count[] = new int[8];
            for(int j = 0 ; j < string[i].length() - 2 ; j++){
                switch (string[i].substring(j,j+3)){
                    case "TTT" :
                        count[0]++;
                        break;
                    case "TTH" :
                        count[1]++;
                        break;
                    case "THT" :
                        count[2]++;
                        break;
                    case "THH" :
                        count[3]++;
                        break;
                    case "HTT" :
                        count[4]++;
                        break;
                    case "HTH" :
                        count[5]++;
                        break;
                    case "HHT" :
                        count[6]++;
                        break;
                    case "HHH" :
                        count[7]++;
                        break;
                }
            }
            for(int k = 0 ; k < 8 ; k++){
                System.out.print(count[k] + " ");
            }
            System.out.println();
        }



    }
}
