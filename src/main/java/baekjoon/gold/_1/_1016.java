//package baekjoon.gold._1;
//
//import java.util.Scanner;
//
//public class _1016 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long min = sc.nextLong();
//        long max = sc.nextLong();
//        int token = 0;
//        int count = 0;
//
//        if (min == 1) min = 2;
//
//        for(long i = min; i <= max; i++) {
//            for(long j = 2; j <= (long)Math.sqrt((double)(i)); j++) {
//                if(i % (j * j ) == 0) {
//                    token = 1;
//                    break;
//                }
//            }
//            if (min == 2 || min == 3) {
//                count++;
//            } else if(token == 1) {
//                token = 0;
//            } else {
//                count++;
//                System.out.println(i);
//            }
//
//        }
//
//        System.out.println(count);
//    }
//}
