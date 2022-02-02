package 알고리즘_복습.문자열;

import java.util.Scanner;

public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        char letter = scanner.next().charAt(0);

        char[] dataArray = data.toCharArray();

        int[] dateArrayCopy = new int[dataArray.length];

        int p = 1000;

        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == letter) {
                p = 0;
                dateArrayCopy[i] = p;
            } else {
                p += 1;
                dateArrayCopy[i] = p;
            }
        }

        p = 1000;
        for (int j = dataArray.length - 1; j >= 0; j--) {
          if (dataArray[j] == letter) {
                p = 0;

            } else {
                p += 1;
                dateArrayCopy[j] = Math.min(dateArrayCopy[j] , p);
            }
        }


        for (int k : dateArrayCopy) {
            System.out.print(k + " ");
        }

    }
}
