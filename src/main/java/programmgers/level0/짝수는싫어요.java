package programmgers.level0;

public class 짝수는싫어요 {
    class Solution {
        public int[] solution(int n) {
            int[] answer;

            if (n % 2 == 0){
                answer = new int[n / 2];
            } else{
                answer = new int[(n + 1) / 2];
            }

            int index = 0;
            for(int i = 1; i <= n; i++) {
                if(i % 2 == 1){
                    answer[index] = i;
                    index++;
                }
            }

            return answer;
        }
    }
}
