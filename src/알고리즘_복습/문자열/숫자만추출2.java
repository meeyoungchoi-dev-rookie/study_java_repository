package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 숫자만추출2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                continue;

            } else {
                answer += String.valueOf(word.charAt(i));
            }
        }


        Integer number = Integer.parseInt(answer);
        System.out.println("answer: " + number);

    }
}
