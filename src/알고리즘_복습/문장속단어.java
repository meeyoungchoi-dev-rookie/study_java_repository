package 알고리즘_복습;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println("문장: " + sentence);

        String[] afterSplit = sentence.split(" ");

        int index = 0;
        int maxLength = afterSplit[0].length();
        for (int i = 1; i < afterSplit.length; i++) {

            if (afterSplit[i].length() > maxLength) {
                maxLength = afterSplit[i].length();
                index = i;
            }
        }

        System.out.println("가장 길이가 긴 단어: " + afterSplit[index]);
    }
}
