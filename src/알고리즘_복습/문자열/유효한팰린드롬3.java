package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 유효한팰린드롬3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.toUpperCase().replaceAll("[^A-Z]", "");


        int lt = 0;
        int rt = word.length() - 1;
        boolean status = false;

        while (lt < rt) {
            if (word.charAt(lt) == word.charAt(word.length() - rt  - 1)) {
                status = true;
            } else  {
                status = false;
            }

            lt += 1;
            rt -= 1;

        }


        if (status == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
