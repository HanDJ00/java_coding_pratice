package programmgers.level0;

public class 피자나눠먹기_2 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if(n % 6 == 0) {
                answer = n / 6;
            }else{
                if(n % 2 == 0){
                    answer = n * 3 / 6;
                }else if (n % 3 == 0) {
                    answer = n  * 2 / 6 ;
                }else answer = n;
            }

            return answer;
        }
    }
}
