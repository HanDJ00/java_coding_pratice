package programmgers.level0;

public class 세균증식 {
    class Solution {
        public int solution(int n, int t) {
            int answer = n;
            for(int i = 0; i < t; i++){
                answer *= 2;
            }
            return answer;
        }
    }
}
