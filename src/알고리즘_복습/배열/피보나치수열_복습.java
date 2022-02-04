package 알고리즘_복습.배열;

import java.util.Scanner;

public class 피보나치수열_복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hang = scanner.nextInt();

        int[] array = new int[hang];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int data : array) {
            System.out.print(data + " ");
        }



    }
}
