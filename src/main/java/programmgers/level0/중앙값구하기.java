package programmgers.level0;

public class 중앙값구하기 {
    class Solution {
        public int solution(int[] array) {
            int[] sort_answer = new int[array.length];

            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            int answer = array[(array.length - 1) / 2 ];
            return answer;
        }
    }
}
