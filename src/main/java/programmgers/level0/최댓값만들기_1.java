package programmgers.level0;

public class 최댓값만들기_1 {
    class Solution {
        public int solution(int[] numbers) {
            int max = 0;

            for(int i = 0; i < numbers.length; i++){
                for(int j = 0;j < numbers.length; j++){
                    if(i != j){
                        if (numbers[i] * numbers[j] >= max)
                            max = numbers[i] * numbers[j];
                    }

                }
            }

            return max;
        }
    }
}
