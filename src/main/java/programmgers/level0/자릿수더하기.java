package programmgers.level0;

public class 자릿수더하기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String num = Integer.toString(n);
            for (int i = 0; i < num.length(); i++){
                answer += ((int)num.charAt(i)) - 48;
            }
            return answer;
        }
    }
}
