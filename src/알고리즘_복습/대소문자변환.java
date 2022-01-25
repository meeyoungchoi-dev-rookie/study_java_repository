package 알고리즘_복습;

import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("word: " + word);

        char[] wordArray = word.toCharArray();

        word = word.toUpperCase();
        char[] wordUpperArray = word.toCharArray();


        for (int i = 0; i < wordArray.length; i++) {

            if (wordArray[i] == wordUpperArray[i]) { // 대문자인 경우
                 wordArray[i] = Character.toLowerCase(wordArray[i]);
            } else { // 소문자인 경우
                wordArray[i] = Character.toUpperCase(wordArray[i]);
            }
        }

        String result = "";
        for (char c : wordArray) {

            result += String.valueOf(c);
        }

        System.out.println("result: " + result);






    }
}
