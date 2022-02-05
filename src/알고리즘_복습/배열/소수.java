package 알고리즘_복습.배열;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        int answer = 0;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j  == 0) {
                    count += 1;
                }
            }

            if (count == 1) {
                answer += 1;
            }
            count = 0;
        }

        System.out.println("소수의 걔수: " + answer);


    }
}
