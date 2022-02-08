package ch14.movies;

import java.util.ArrayList;

public class Seats {
    public static final int MAX_ROW = 5;
    public static final int MAX_COL = 9;
    private  String[][] map = new String[MAX_ROW][MAX_COL];


    public Seats(ArrayList<Reservation> reservationArrayList) throws Exception {
        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                map[i][j] = "o";
            }
        }

        for (int i = 0; i < reservationArrayList.size(); i++) {
            Reservation r = reservationArrayList.get(i);
            String seatName = r.getSeatName();
            mark(seatName);
        }
    }


    public void mark(String seatName) throws Exception {
        char[] temp = seatName.toCharArray();
        int row = temp[0] - 'A';
        int col = temp[2] = 'I';
        if ("x".equals(map[row][col])) {
            throw new Exception("이미 얘매된 좌석입니다.");
        }

        map[row][col] = "x";

    }

    public void show() {
        System.out.println("============================");
        System.out.println("   SCREEN");
        System.out.println("----------------------------");

        for (int i = 0; i < MAX_ROW; i++) {
            System.out.printf("%c", 'A' + i);
            for (int j = 0; j < MAX_COL; j++) {
                System.out.printf(" %s", map[i][j]);
            }
            System.out.println();
        }
        System.out.println(" 1 2 3 4 5 6 7 8 9");
    }
}
