package programmgers.level0;
import java.util.Arrays;
public class 문자열정렬하기_1 {

    class Solution {
        public int[] solution(String my_string) {
            int token = 0;
            for(int i = 0; i < my_string.length(); i++){
                if(((int)my_string.charAt(i))>= 48 && ((int)my_string.charAt(i)) <= 57)
                    token++;
            }
            int[] answer = new int[token];
            token = 0;
            for(int i = 0; i < my_string.length(); i++){
                if(((int)my_string.charAt(i))>= 48 && ((int)my_string.charAt(i)) <= 57){
                    answer[token] = ((int)my_string.charAt(i) - 48);
                    token++;
                }

            }
            Arrays.sort(answer);

            return answer;
        }
    }
}
