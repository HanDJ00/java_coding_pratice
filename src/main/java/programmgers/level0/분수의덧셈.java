package programmgers.level0;

public class 분수의덧셈 {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int answer_numer = numer1 * denom2 + numer2 * denom1;
            int answer_denom = denom1 * denom2;
            if (answer_numer > answer_denom){
                for(int i = 2; i <= answer_denom ; i++){
                    while(answer_numer % i == 0 && answer_denom % i == 0){
                        answer_numer /= i;
                        answer_denom /= i;

                    }
                }
            }else if (answer_numer <= answer_denom){
                for(int i = 2; i <= answer_numer ; i++){
                    while(answer_numer % i == 0 && answer_denom % i == 0){
                        answer_numer /= i;
                        answer_denom /= i;

                    }
                }
            }
            int[] answer = {answer_numer,answer_denom};

            return answer;
        }
    }
}
