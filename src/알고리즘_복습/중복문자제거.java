package 알고리즘_복습;

import java.util.Scanner;

public class 중복문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == i) {
                result += word.charAt(i);
            } else {
                continue;
            }
        }

        System.out.println("result: " + result);

    }
}
