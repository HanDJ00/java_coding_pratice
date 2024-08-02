package programmgers.level0;

public class 대문자와소문자 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for (int i = 0; i < my_string.length(); i++){
                if (((int)my_string.charAt(i)) >= 65 && ((int)my_string.charAt(i) <= 90)){
                    answer += (char)((int)my_string.charAt(i) + 32);
                }else if (((int)my_string.charAt(i)) >= 97 &&
                        ((int)my_string.charAt(i) <= 122)){
                    answer += (char)((int)my_string.charAt(i) - 32);
                }
            }
            return answer;
        }
    }
}
