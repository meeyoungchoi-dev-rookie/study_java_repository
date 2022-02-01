package 알고리즘_복습.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 중복문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        char[] wordArr = word.toCharArray();

        char[] duplicateWord = new char[word.length()];

        duplicateWord[0] = wordArr[0];

        for (int i = 1; i < wordArr.length; i++) {

            for (int j = 0; j < i; j++) {
                if (wordArr[i] != duplicateWord[j]) {
                     duplicateWord[j] = wordArr[i];
                }
            }
        }

        System.out.println("중복 문자 제거 결과: " + Arrays.toString(duplicateWord));




    }
}
