package 알고리즘;

import java.util.Scanner;

public class 임시반장 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentNumbers = scanner.nextInt();

        int[] students = new int[studentNumbers];
        int[] sameMatesCount = new int[studentNumbers];

        int[][] classmates = new int[studentNumbers][studentNumbers];

        for (int i = 0; i < studentNumbers; i++) {
            for (int j = 0; j< studentNumbers; j++) {

                classmates[i][j] = scanner.nextInt();

            }
        }

        int sameClass = 0;
        for (int s = 0; s < studentNumbers; s++) {
            // 열 단위로 비교
            int y = 0;

            for (int x = 1; x <= classmates.length - 1; x++) {
                if (classmates[y][x] == classmates[y][x - 1]) {
                    sameClass += 1;
                }
            }

            students[s] = s;
            sameMatesCount[s] = sameClass;

            y += 1;



        }

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < sameMatesCount.length; i++) {
            System.out.print(sameMatesCount[i] + " ");
        }


    }
}
