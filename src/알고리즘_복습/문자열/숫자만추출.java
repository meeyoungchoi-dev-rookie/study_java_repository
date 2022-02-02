package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 숫자만추출 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                answer += String.valueOf(word.charAt(i));
            } else {
                continue;
            }
        }


        Integer number = Integer.parseInt(answer);
        System.out.println("answer: " + number);

    }
}
