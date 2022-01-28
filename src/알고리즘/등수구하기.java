package 알고리즘;

import java.util.Scanner;

public class 등수구하기 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();

        int[] scores = new int[studentCount];

        int[] ranks = new int[studentCount];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }



        for (int j = 0; j < scores.length; j++ ) {
            int rank = 1;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > scores[j]) {
                    System.out.print(" " + scores[i] + " : " + rank);
                    rank += 1;
                }
            }
            ranks[j] = rank;
            System.out.print(" 기준 " + scores[j] + " : " + ranks[j]);
            System.out.println();
        }



        for (int i = 0; i < ranks.length; i++) {
            System.out.print(ranks[i] + " ");
        }





    }






}
