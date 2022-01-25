package ch06;

public class MatrixGugudan {
    public static void main(String[] args) {


        int[][] gugudan = new int[10][10];

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                gugudan[i][j] = i * j;
            }
        }



    }
}
