package 프로그래머스.해시;

import java.util.ArrayList;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String answer = "";
        String[] participant = {"marina", "josipa", "nikola", "josipa", "filipa"};

        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        완주하지못한선수 s = new 완주하지못한선수();
        answer = s.solution(participant , completion);
        System.out.println("answer: " + answer);

    }

    public String solution(String[] participant, String[] completion) {

        String answer = "";
        ArrayList<String> nonCompletions = new ArrayList<>();

        String ok = "";
        int notSameCount = 0;
        for (String data : participant) {
            String result = data;
            for (int i = 0; i < completion.length; i++) {
                if (result.equals(completion[i])) {
                    continue;
                } else {
                    notSameCount += 1;
                    if (notSameCount == completion.length) {
                        nonCompletions.add(result);
                    }
                }

            }
            notSameCount = 0;
        }



        int sameCount = 0;

        ArrayList<String> participantCopy = new ArrayList<>();








        for (String result : nonCompletions) {
            answer += result;
        }

        return answer;
    }





}
