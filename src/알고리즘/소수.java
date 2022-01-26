package 알고리즘;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] numberArray = new int[number];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i + 1;
        }

        int decimalCount = 0;
        int okCount = 0;
        for (int data : numberArray) {
            if (data != 1) {
                for (int i = 2; i <= data; i++) {
                    if (data % i == 0) {
                        okCount += 1;
                    }
                }
                if (okCount == 1) {
                    decimalCount += 1;
                }
            }

            okCount = 0;
        }

        System.out.println("소수의 개수: " + decimalCount);


    }
}
