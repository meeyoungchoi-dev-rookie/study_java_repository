package 알고리즘;

import java.util.Scanner;

public class 봉우리 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = 7;

        int[][] dobuleArray = new int[length + 2][length + 2];

        // 윗줄을 0으로
        // 00 01 02 03 04 05 06
        for (int i = 0; i < dobuleArray.length; i++) {
            for (int j = 0; j < dobuleArray.length; j++) {
                if (i == 0) {
                    dobuleArray[i][j] = 1;
                }
            }
        }

        // 왼쪽 세로줄을 0으로
        int y = 0;
        for (int x = 0; x < dobuleArray.length; x++ ) {
            dobuleArray[x][y] = 2;
        }


        // 오른쪽 세로줄을 0으로
        y = dobuleArray.length - 1;
        for (int x = 0; x < dobuleArray.length; x++) {
            dobuleArray[x][y] = 3;
        }


        // 밑에 가로줄 0으로
        int x = dobuleArray.length - 1;
        for (y = 0; y < dobuleArray.length; y++) {
            dobuleArray[x][y] = 4;
        }

        // 테두리가 잘 들어갔는지 확인
        for (int i = 0; i < dobuleArray.length; i++) {
            for (int j = 0; j < dobuleArray.length; j++) {
                System.out.print(dobuleArray[i][j] + " ");
            }
            System.out.println();
        }







    }
}
