package 알고리즘;

import java.util.Scanner;

public class FrontBackSame2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toUpperCase();
        int legth = word.length();
        int lLength = word.length();
        int rLength = word.length() - 1;

        char[] wordArray = word.toCharArray();

        boolean status  = false;
        for (int i = 0; i < legth / 2; i++) {

            if (Character.isAlphabetic(word.charAt(i)) || Character.isAlphabetic(legth - i -1)) {

                if (word.charAt(i) == word.charAt(legth - i - 1)) {
                    status = true;
                } else {
                    status = false;
                }

            }

        }

        System.out.println("status: " + status);


    }
}
