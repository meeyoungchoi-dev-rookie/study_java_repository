package 알고리즘;


import java.io.IOException;

import java.util.Scanner;


public class ArrayBigNumber {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        int[] array = new int[index];

        for (int i = 0; i < index; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            if ( i - 1 == 0) {
                System.out.printf("%d " , array[i - 1]);
            }

            if (array[i] > array[i - 1]  ) {
                System.out.printf("%d " , array[i]);
            }
        }

    }
}
