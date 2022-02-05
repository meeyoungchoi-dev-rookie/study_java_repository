package 알고리즘_복습.배열;

import java.util.Scanner;

public class 소수2 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();

       int[] array = new int[num + 1];

       for (int i = 0; i < array.length; i++) {
           array[i] = i;
       }

       for (int data : array) {
           System.out.print(data + " ");
       }
        System.out.println();


       int answer = 0;
       for (int k = 2; k <= num; k++) {
            if (array[k] != 1) {
                System.out.println(array[k]);
                answer += 1;
                for (int j = k; j <= num; j = j + k) {
                    array[j] = 1;
                }
            }
       }

        System.out.println(num + "까지의 숫자중 솟수의 개수: " + answer);



    }
}
