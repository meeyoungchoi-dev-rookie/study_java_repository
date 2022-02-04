package 알고리즘_복습.배열;

import java.util.Scanner;

public class 보이는학생_복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();

        int[] heightArray = new int[studentCount];

        for (int i = 0; i < heightArray.length; i++) {
            heightArray[i] = scanner.nextInt();
        }

        int max = heightArray[0];

        int answer = 1; // 첫번쨰 학생은 무조건 보인다
        for (int i = 1; i < heightArray.length; i++) {
             if (max < heightArray[i]) {
                max = heightArray[i];
                answer += 1;
            }
        }

        System.out.println("선생님이 볼수 있는 최대 학생수: " + answer);






    }
}
