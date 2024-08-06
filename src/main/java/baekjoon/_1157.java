package baekjoon;

import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        char[] chars = new char[26];
        int[] count = new int[26];
        int count_max = 0;
        int token = 0;
        int index = 0;
        char a;

        for(int i = 0; i < 26; i++){
            chars[i] = (char)('A' +i) ;
        }

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= 97 && string.charAt(i) <= 122 ){
                a = (char)(string.charAt(i) -32);
            }
            else {
                a = string.charAt(i);
            }

            for(int j = 0; j < 26; j++){
                if (a == chars[j]){
                    count[j]++;
                    break;
                }
            }
        }

        for(int i = 0; i < 26; i++){
            if(count[i] > count_max){
                count_max = count[i];
                token = 0;
                index = i;
            }else if(count[i] == count_max){
                token = 1;
            }
        }

        if(token == 1){
            System.out.println("?");
        }else {
            System.out.println(chars[index]);
        }


    }
}
