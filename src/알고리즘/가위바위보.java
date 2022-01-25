package 알고리즘;

import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int gameCount = scanner.nextInt();

        int[] playerA = new int[gameCount];
        int[] playerB = new int[gameCount];

        String[] winneerArray = new String[gameCount];

        for (int i = 0; i < playerA.length; i++) {
            playerA[i] = scanner.nextInt();
        }

        for (int i = 0; i < playerB.length; i++) {
            playerB[i] = scanner.nextInt();
        }

        for (int j = 0; j < playerA.length; j++) {

            if (playerA[j] == playerB[j]) {
                winneerArray[j] = "D";
            } else if (playerA[j] == 1 && playerB[j] == 3) {// 가위
                winneerArray[j] = "A";
            } else if (playerA[j] == 2 && playerB[j] == 1) {// 바위
                winneerArray[j] = "A";
            } else if (playerA[j] == 3 && playerB[j] == 2) { // 보
                winneerArray[j] = "A";
            } else {
                winneerArray[j] = "B";
            }
        }

        for (String str : winneerArray) {
            System.out.println(str);
        }
    }
}
