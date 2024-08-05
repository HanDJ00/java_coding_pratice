package programmgers.level0;

public class 문자열안에문자열 {
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 2;
            for (int i = 0; i <= str1.length()-str2.length(); i++){
                String check = "";
                for(int j = 0; j < str2.length(); j++){
                    check += str1.charAt(i+j);
                }
                if (check.equals(str2)) {
                    answer = 1;
                    break;
                }
            }
            return answer;
        }
    }
}
