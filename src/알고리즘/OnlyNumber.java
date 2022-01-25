package 알고리즘;

import java.util.Scanner;

public class OnlyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String result = "";
        for (int i = 0; i <  word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                result += word.charAt(i);
            }
        }

        System.out.println("resul: " + Integer.parseInt(result));
    }
}
