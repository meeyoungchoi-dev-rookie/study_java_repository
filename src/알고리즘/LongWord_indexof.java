package 알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LongWord lw = new LongWord();


        String sentence = scan.nextLine();
        System.out.println("sentence: " + sentence);
        String result = lw.solution(sentence);
        System.out.println(result);
    }

    public String solution(String sentence) {
        int longCount = 0;
        String result = "";
        String[] afterSplit = sentence.split(" ");
        ArrayList<Integer> afterSplitLength = new ArrayList<>();
        ArrayList<String> longestWords = new ArrayList<>();

        for (int i = 0; i < afterSplit.length; i++) {
            System.out.println(afterSplit[i]);
            afterSplitLength.add(afterSplit[i].length());
        }

        for (Integer data : afterSplitLength) {
            System.out.println("data: " + data);
        }

        System.out.println("길이가 가장 긴 데이터: " + Collections.max(afterSplitLength));

        for (String str : afterSplit) {
            if (str.length() ==  Collections.max(afterSplitLength)) {
                longCount += 1;
                result = str;
                longestWords.add(result);
                if (longCount >= 2) {
                    result = longestWords.get(0);
                }
            }
        }

        System.out.println("길이가 가장 긴 단어: " + result);

        return result;
    }



}
