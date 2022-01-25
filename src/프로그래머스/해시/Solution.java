package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] participant = new String[4];
        participant[0] = "marina";
        participant[1] = "josipa";
        participant[2] = "marina";
        participant[3] = "vinko";


        String[] completion = new String[3];
        completion[0] = "josipa";
        completion[1] = "filipa";
        completion[2] = "marina";





        String answer = sol.solution(participant , completion);
        System.out.println("완주하지 못한 선수: " + answer);


    }




        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
            for (String player : completion) hm.put(player, hm.get(player) - 1);

            for (String key : hm.keySet()) {
                if (hm.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }






}
