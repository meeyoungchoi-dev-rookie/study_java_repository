package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        word = word.toUpperCase();

        boolean status = false;
        for (int i = 0; i < word.length() / 2; i++) {
            char frontSubstr = word.charAt(i);
            System.out.println("앞글자: " + frontSubstr);

            char backSubstr = word.charAt(word.length()- i - 1);
            System.out.println("뒷글자: " + backSubstr);

            if (frontSubstr == backSubstr) {
                status = true;
            }
        }

        if (status == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}
