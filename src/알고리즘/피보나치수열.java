package 알고리즘;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hang = scanner.nextInt();

        int[] piboArray = new int[hang];


        piboArray[0] = 1;
        piboArray[1] = 1;


        for (int i = 2; i < piboArray.length; i++) {
             piboArray[i] = piboArray[i - 1] + piboArray[i - 2];
        }

        for (int data : piboArray) {
            System.out.print(data + " ");
        }






    }





}
