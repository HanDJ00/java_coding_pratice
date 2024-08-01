package programmgers.level0;

public class 최빈값구하기 {
    class Solution {
        public int solution(int[] array) {
            int[] freq = new int[1000];
            int max = 0;
            int max_count = 0;
            boolean multi = false;

            for (int i = 0; i < array.length; i++) {
                freq[array[i]]++;
            }

            for (int i = 0; i < freq.length; i++) {
                if(freq[i] > max_count){
                    multi = false;
                    max_count = freq[i];
                    max = i;
                }else if (freq[i] == max_count) multi = true;

            }




            if (multi) max = -1;

            return max;
        }
    }
}
