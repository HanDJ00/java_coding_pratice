package programmgers.level0;

public class _369게임 {
    class Solution {
        public int solution(int order) {
            int answer = 0;
            do{
                if ((order % 10) % 3 == 0 && (order % 10) != 0){
                    answer++;
                }
                order /= 10;
            } while (order > 0);
            return answer;
        }
    }
}
