package programmgers.level0;

public class 머쓱이보다키큰사람 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for (int i = 0 ; i < array.length; i++){
                if (array[i] > height)
                    answer += 1;
            }
            return answer;
        }
    }
}
