package 알고리즘_복습;

import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wordCount = scanner.nextInt();
        System.out.println(wordCount);

        String[] woardArray = new String[wordCount];

        for (int i = 0; i < woardArray.length; i++) {
            String word = scanner.next();
            woardArray[i] = word;

        }

        for (String str : woardArray) {
            char[] strArray = str.toCharArray();
            for (int i = strArray.length - 1; i >= 0; i--) {
                System.out.print(strArray[i]);
            }
            System.out.println();
        }
    }
}
