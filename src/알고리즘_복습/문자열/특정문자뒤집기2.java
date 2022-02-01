package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 특정문자뒤집기2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();
        String answer = "";
        int stIndex = 0;
        int endIndex = word.length() - 1;

        while (stIndex < endIndex) {
            if (!Character.isAlphabetic(wordArray[stIndex])) {
                stIndex += 1;
            } else if (!Character.isAlphabetic(wordArray[endIndex])) {
                endIndex -= 1;
            } else {
                char data = wordArray[stIndex];
                wordArray[stIndex] = wordArray[endIndex];
                wordArray[endIndex] = data;
                stIndex += 1;
                endIndex -= 1;

            }



        }
        answer = String.valueOf(wordArray);
        System.out.println("정답: " + answer);



    }
}
