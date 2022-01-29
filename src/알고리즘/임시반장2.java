package 알고리즘;

import java.util.Scanner;

public class 임시반장2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int classMates = scanner.nextInt();//5

        int[][] classroom = new int[classMates + 1][6];//0 ~ 5

        for (int i = 1; i < classMates + 1; i++) {
            System.out.print("i: " + i);
            for (int j = 1; j < 6; j++) {
                System.out.print("j: " + j);
                classroom[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < classMates + 1; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(classroom[i][j] + " ");
            }
            System.out.println();
        }


        int sameRoomMate = 0;
        for (int i = 1; i < classMates + 1; i++ ) {
            for (int j = 2; j < classMates + 1; j++) {
                for (int g = 1; g < 6; g++) {

                    if (classroom[i][g] == classroom[j][g]) {
                        System.out.print(i + " , " + j + " , " + g );
                        sameRoomMate += 1;
                    }
                }
                System.out.println();

            }
            System.out.print(i + "번학생과 같은 반이였던 학생수 : " + sameRoomMate);
            sameRoomMate = 0;
        }



    }
}
