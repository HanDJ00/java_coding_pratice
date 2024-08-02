package programmgers.level0;

public class n의배수고르기 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            int[] answer_clone = new int[100];
            int count = 0;

            for (int i = 0; i < numlist.length; i++){
                if (numlist[i] % n == 0){
                    answer_clone[count] = numlist[i];
                    count++;
                }
            }
            int[] answer = new int[count];
            for (int i = 0; i < count; i++){
                answer[i] = answer_clone[i];
            }

            return answer;
        }
    }
}
