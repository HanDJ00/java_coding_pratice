package programmgers.level0;

public class 최댓값만들기_2 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = numbers[0] * numbers[1];
            for(int i = 0 ;i < numbers.length; i++) {
                for(int j = 0; j < numbers.length; j++) {
                    if(i != j){
                        if(numbers[i] * numbers[j] >= answer){
                            answer = numbers[i] * numbers[j];
                        }
                    }
                }
            }
            return answer;
        }
    }
}
