package 알고리즘_복습;

import java.util.Scanner;

public class FindLetter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char letter = scanner.next().charAt(0);

        System.out.println("word: " + word);
        System.out.println("letter: " + letter);


        word = word.toUpperCase();
        letter= Character.toUpperCase(letter);

        char[] wordAray = word.toCharArray();

        int sameCount = 0;
        for (int i = 0; i < wordAray.length; i++) {

            if (wordAray[i] == letter) {
                sameCount += 1;
            }
        }

        System.out.println(sameCount);







    }
}
