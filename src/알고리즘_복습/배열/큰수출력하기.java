package 알고리즘_복습.배열;

import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();

        int[] numArray = new int[numCount];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }

        for (int j = 0; j < numArray.length - 1; j++) {
            if (j == 0) {
                System.out.print(numArray[j] + " ");
            }
            else if (numArray[j]  < numArray[j + 1]) {
                System.out.print(numArray[j + 1] + " ");
            }
        }
    }
}
