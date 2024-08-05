package programmgers.level0;

public class 외계행성의나이 {
    class Solution {
        public String solution(int age) {
            String answer = "";
            String copy = "";
            do{
                copy += (char)(age % 10 + 97);
                age /= 10;

            }while (age > 0);

            for(int i = copy.length() - 1; i >= 0; i--){
                answer += copy.charAt(i);
            }


            return answer;
        }
    }
}
