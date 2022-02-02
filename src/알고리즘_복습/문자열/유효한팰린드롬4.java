package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 유효한팰린드롬4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder sb = new StringBuilder(word);
        String wordReversed = sb.reverse().toString();

        if (word.equals(wordReversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
