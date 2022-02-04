package 알고리즘_복습.배열;

import java.util.Scanner;

public class 피보나치수열_복습2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hang = scanner.nextInt();

        int a = 1; // 배열로 따졌을때 0인덱스
        int b = 1; // 배열로 따졌을때 1인덱스
        int c = 0;
        System.out.print(a + " " + b + " ");

        for (int j = 2; j < 10; j++) {

            c =  a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }


    }
}
