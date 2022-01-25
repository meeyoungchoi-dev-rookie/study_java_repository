package 알고리즘_복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class 단어뒤집기_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wordCount = scanner.nextInt();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < wordCount; i++) {
            String word = scanner.next();
            words.add(word);
        }

        Collections.reverse(words);

        for (String str : words) {
            System.out.println(str);
        }


    }
}
