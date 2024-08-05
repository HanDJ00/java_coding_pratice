package programmgers.level0;

public class 약수구하기 {
    class Solution {
        public int[] solution(int n) {
            int token = 0;
            for (int i = 1; i <= n; i++){
                if(n % i == 0)
                    token++;
            }
            int[] answer = new int[token];
            token = 0;
            for (int i = 1; i <= n; i++){
                if(n % i == 0) {
                    answer[token] = i;
                    token++;
                }

            }
            return answer;
        }
    }
}
