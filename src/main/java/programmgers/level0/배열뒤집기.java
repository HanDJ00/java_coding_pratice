package programmgers.level0;

public class 배열뒤집기 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for(int i = 0; i < num_list.length; i++){
                answer[num_list.length - i - 1] = num_list[i];
            }
            return answer;
        }
    }
}
