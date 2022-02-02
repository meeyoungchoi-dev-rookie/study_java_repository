package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 숫자만추출3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();
        int answer = 0;

        for (char w : wordArray) {
            if (w >= 48 && w <= 57) {
                answer = answer * 10 + (w - 48);

            }
        }

        System.out.println("answer: " + answer);


    }
}
