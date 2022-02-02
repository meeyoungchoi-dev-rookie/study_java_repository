package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.toUpperCase().replaceAll("[^A-Z]", "");


        boolean status = false;



        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                status = true;
            } else {
                status = false;
            }

        }


        if (status == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
