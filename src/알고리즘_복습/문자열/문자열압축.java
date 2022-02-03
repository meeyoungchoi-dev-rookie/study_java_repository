package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();


        String answer = "";
        word = word + " ";

        int cnt = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                cnt += 1;

            }else  {
                answer += word.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println("문자열 압축결과: " + answer);



    }
}
