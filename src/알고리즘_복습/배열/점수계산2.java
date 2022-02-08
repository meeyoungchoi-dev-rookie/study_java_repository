package 알고리즘_복습.배열;

import java.util.Scanner;

public class 점수계산2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int questionCount = scanner.nextInt();

        int[] questions = new int[questionCount];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = scanner.nextInt();
        }

        System.out.println();

        int cnt = 0;
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i] == 1) {
                cnt += 1;
                score += cnt;
            } else {
                cnt = 0;
                score += cnt;
            }
        }

        System.out.println("총점: " + score);

    }
}
