package 알고리즘_복습.배열;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int questionCount = scanner.nextInt();

        int[] arr = new int[questionCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();

        int totalScore = 0;
        int okCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (arr[i - 1] == 1) {
                    okCount += 1;
                    totalScore = totalScore + okCount;
                } else {
                    okCount = 0;
                }
                System.out.println(arr[i] + " , " + arr[i - 1] + " " + totalScore);
            } else {
                if (arr[i - 1] == 1) {
                    okCount += 1;
                    totalScore = totalScore + okCount;
                } else {
                    okCount = 0;
                }
                System.out.println(arr[i] + " , " + arr[i - 1] + " " + totalScore);
            }
        }

        System.out.println("총점: " + totalScore);
    }
}
