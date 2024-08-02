package programmgers.level0;

public class 삼각형의완성조건_1 {
    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            int max_index = 0;
            int other_sides = 0;
            for(int i=0; i < sides.length; i++){
                if(sides[i] >= sides[max_index] )
                    max_index = i;
            }
            for(int i=0; i < sides.length; i++){
                if(i != max_index)
                    other_sides += sides[i];
            }

            if(sides[max_index] >= other_sides ){
                answer = 2;
            }else answer = 1;

            return answer;
        }
    }
}
