package programmgers.level0;

public class 인덱스바꾸기 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            char[] temp = new char[my_string.length()];
            for(int i = 0; i < my_string.length(); i++){
                temp[i] = my_string.charAt(i);
            }
            char tmp = temp[num1];
            temp[num1] = temp[num2];
            temp[num2] = tmp;

            for(int i = 0; i < my_string.length();i++){
                answer += temp[i];
            }
            return answer;
        }
    }
}
