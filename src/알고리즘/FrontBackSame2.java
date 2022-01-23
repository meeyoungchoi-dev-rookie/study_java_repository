package 알고리즘;

import java.util.Scanner;

public class FrontBackSame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toUpperCase();
        int legth = word.length();


        boolean status  = false;
        for (int i = 0; i < legth / 2; i++) {
            if (word.charAt(i) == word.charAt(legth - i - 1)) {
               status = true;
            } else {
                status = false;
            }
        }




    }
}
