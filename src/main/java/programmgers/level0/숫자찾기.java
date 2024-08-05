package programmgers.level0;

public class 숫자찾기 {
    class Solution {
        public int solution(int num, int k) {
            int answer = 0;
            int token = 0;
            int token2 = 1;
            do{
                if(num % 10 == k){
                    token = token2;
                }
                num /= 10;
                token2++;

            } while(num > 0);
            if (token == 0)
                answer = -1;
            else
                answer = token2 - token;

            return answer;
        }
    }
}
