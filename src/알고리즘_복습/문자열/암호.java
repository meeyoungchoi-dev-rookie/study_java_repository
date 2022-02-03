package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cutNum = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();
        String answer = "";

        for (int i = 0; i < cutNum; i++) {
            String temp = word.substring(0 , 7).replace("#", "1").replace("*", "0");
            System.out.println(temp);

            answer += (char) Integer.parseInt(temp, 2);
            word = word.substring(7);

        }

        System.out.println("암호 해제: " + answer);
    }
}
